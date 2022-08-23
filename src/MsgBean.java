package beer4all;
public class MsgBean {

	// atributos -------------------------------------------------------------------
	protected String msgRegisterDriver;
	protected String msgGetConnection;
	protected String msgCreateStatement;
	protected String msgExecuteQuery;
	protected String msgGetAllResults;
	
		
	// métodos GET -----------------------------------------------------------------
	public String getMsgRegisterDriver() {return (msgRegisterDriver);}
	public String getMsgGetConnection() {return (msgGetConnection);}
	public String getMsgCreateStatement() {return (msgCreateStatement);}
	public String getMsgExecuteQuery() {return (msgExecuteQuery);}
	public String getMsgGetAllResults() {return (msgGetAllResults);}
	
	// métodos SET -----------------------------------------------------------------
	public void setMsgRegisterDriver(String msgRegisterDriver) {
		this.msgRegisterDriver = msgRegisterDriver;
	}
	public void setMsgGetConnection(String msgGetConnection) {
		this.msgGetConnection = msgGetConnection;
	}
	public void setMsgCreateStatement(String msgCreateStatement) {
		this.msgCreateStatement = msgCreateStatement;
	}
	public void setMsgExecuteQuery(String msgExecuteQuery) {
		this.msgExecuteQuery = msgExecuteQuery;
	}
	public void setMsgGetAllResults(String msgGetAllResults) {
		this.msgGetAllResults = msgGetAllResults;
	}
}