package com.green.day22;

import java.sql.*;


public class MyConnection {
    private final String DRIVER = "org.mariadb.jdbc.Driver";
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DB_NAME = "market_db";
    private final String USERNAME = "root";
    private final String PASSWORD = "green502";

    public Connection getConn() throws SQLException, ClassNotFoundException {
        String url = String.format("jdbc:mariadb://%s:%s/%s", HOST, PORT, DB_NAME);
        Class.forName(DRIVER);
        Connection conn = DriverManager.getConnection(url, USERNAME, PASSWORD);
        System.out.println("DB 접속 완료");
        return conn;
    }

    public void close(Connection conn) {
        if (conn == null) {
            return;
        }
        try {
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("DB 연결을 종료합니다.");
    }

    public void close(Statement stat, Connection conn) {
        if (stat != null) {
            try {
                stat.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        close(conn);
    }

    public void close(ResultSet rs, Statement stat, Connection conn) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        close(stat, conn);
    }
}

class MyConnectionTest {
    public static void main(String[] args) {
        MyConnection myConnection = new MyConnection();
        Connection conn = null;

        try {
            conn = myConnection.getConn();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            myConnection.close(conn);
        }
    }
}