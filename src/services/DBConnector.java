package beer4all.services;

// Necessary classes to get Pooled Database Connection
import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.ConnectionFactory;
import org.apache.commons.dbcp.DriverManagerConnectionFactory;
import org.apache.commons.dbcp.PoolableConnectionFactory;
import org.apache.commons.dbcp.PoolingDataSource;
import org.apache.commons.pool.impl.GenericObjectPool;

/**
 * This class defines getConnection
 * and releaseConnection methods. In getConnection method, connection
 * caching feature of JDBC 2.0 is implemented to get the database connection.
 */
public class DBConnector {
    
    private static DBConnector connector_ = null;
	private static PoolingDataSource dataSource_ = null;
    
    // Create a sinlgeton object
    public static DBConnector getInstance() throws Exception {
        return connector_;
    }
    
    // Create a sinlgeton object
    public static DBConnector getInstance(String url, String user, String password) throws Exception {
        if(connector_ == null) {
            connector_ = new DBConnector(url, user, password);
        }
        return connector_;
    }    
    
    /**
     * Default Constructor. Takes no arguments
     */
    private DBConnector()  throws SQLException {}
    
    private DBConnector(String url, String user, String password)  throws Exception {
        //
        // First, we'll need a ObjectPool that serves as the
        // actual pool of connections.
        //
        // We'll use a GenericObjectPool instance, although
        // any ObjectPool implementation will suffice.
        //
		Class.forName("com.mysql.jdbc.Driver");
		GenericObjectPool connectionPool = new GenericObjectPool(null);
		connectionPool.setMaxActive(5);
		connectionPool.setMaxWait(2);
		connectionPool.setMaxIdle(2);
	
        //
        // Next, we'll create a ConnectionFactory that the
        // pool will use to create Connections.
        // We'll use the DriverManagerConnectionFactory,
        // using the connect string passed in the command line
        // arguments.
        //
        ConnectionFactory connectionFactory = 
			new DriverManagerConnectionFactory(url,user,password);

        //
        // Now we'll create the PoolableConnectionFactory, which wraps
        // the "real" Connections created by the ConnectionFactory with
        // the classes that implement the pooling functionality.
        //
        PoolableConnectionFactory poolableConnectionFactory = 
			new PoolableConnectionFactory(connectionFactory,connectionPool,null,null,false,true);

        //
        // Finally, we create the PoolingDriver itself,
        // passing in the object pool we created.
        //
		dataSource_ = new PoolingDataSource(connectionPool);
    }
    
    public Connection getConnection() throws Exception {
		//return 
        return dataSource_.getConnection();
    }
}
