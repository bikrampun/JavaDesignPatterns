package com.example;

interface DBConnectionInterface {
    public int connect();
}

class MySqlConnection implements DBConnectionInterface {
    public int connect() {
        return 1;
    }
}
public class PasswordReminder {
    private DBConnectionInterface dbConnectionInterface;

    public PasswordReminder(DBConnectionInterface dbConnection) {
        this.dbConnectionInterface = dbConnection;
    }
}
