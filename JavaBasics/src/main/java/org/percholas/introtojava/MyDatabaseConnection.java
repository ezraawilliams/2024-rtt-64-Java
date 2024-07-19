package org.percholas.introtojava;

public enum MyDatabaseConnection {
    ORACLEDB("ORACLE DATABASE IS CONNECTION ..."),
    SQLDBB("SQL DATABASE IS CONNECTING..."),
    POSTGRESSQL("POSTGRES DATABASE IS CONNECTING");
    // Class variable
    private final String establishDatabaseConnection;
    // private enum constructor
    private MyDatabaseConnection(String establishDatabaseConnection) {
        this.establishDatabaseConnection = establishDatabaseConnection;
    }
    // getter
    public String getEstablishDatabaseConnection() {
        return establishDatabaseConnection;   }
}


