UPDATE usuarios SET cantidad=10 WHERE username='dago'

// REGISTER DRIVER
try {
    Driver d = (Driver)Class.forName("com.mysql.jdbc.Driver").newInstance();
} catch (Exception e) {
    System.out.println(e)
}

// GET CONNECTION
Connection con;
try{
    con = DriverManager.getConnection("jdbc:mysql://localhost/beer4all",userName,password);
}catch(Exception e){
    System.out.println(e);
}

// GET CONNECTION WARNINGS
SQLWarning warning = null;
try {
    warning = con.getWarnings();

    if (warning == null){
        System.out.println("No Warnings");
        return;
    }

    while (warning != null) {
        System.out.println("Warning: "+warning);
        warning = warning.getNextWarning();
    }
} catch (Exception e){
    System.out.println(e);
}
// GET CONNECTION
Connection con;
try{
    con = DriverManager.getConnection("jdbc:mysql://localhost/beer4all",userName,password);
}catch(Exception e){
    System.out.println(e);
}

// GET CONNECTION WARNINGS
SQLWarning warning = null;
try {
    warning = con.getWarnings();

    if (warning == null){
        System.out.println("No Warnings");
        return;
    }

    while (warning != null) {
        System.out.println("Warning: "+warning);
        warning = warning.getNextWarning();
    }
} catch (Exception e){
    System.out.println(e);
}

 // CREATE STATEMENT 
Statement stmt;
try {
    stmt = con.createStatement();
} catch (Exception e){
    System.out.println(e);
}

 // EXECUTE UPDATE 
int results;
try {
    results = stmt.executeUpdate("UPDATE usuarios SET cantidad=10 WHERE username='dago'")
} catch (Exception e){
    System.out.println(e);
}
