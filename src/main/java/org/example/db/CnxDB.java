package org.example.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CnxDB {
    private Connection conn;
    private Statement stmt;

    public CnxDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/gestion_bibliotheque",
                "root",
                ""
        );
        stmt=conn.createStatement();
    }

    public Connection getConnection() { return this.conn; }
    public Statement getStatement() { return this.stmt; }
}
