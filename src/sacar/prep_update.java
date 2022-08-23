 // CREATE PREPARED STATEMENT 
PreparedStatement prepstmt;
try {
    prepstmt = con.prepareStatement("UPDATE usuarios SET cantidad=? WHERE username=?");
} 
catch (Exception e){}

// SET INT PARAMETER 
try { 
	prepstmt.setInt(pos, value); 
} 
catch (Exception e){} 

// SET STRING PARAMETER 
try { 
    prepstmt.setString(pos, value); 
} catch (Exception e){} 

// EXECUTE PREPARED SQL 
boolean ret = false; 
ResultSet results = null; 
int updateCount = 0; 
try { 
    ret = prepstmt.execute(); 
    if (ret == true) { 
        results = prepstmt.getResultSet(); 
    } 
    else { 
        updateCount = prepstmt.getUpdateCount(); 
    } 
} 
catch(Exception e){} 