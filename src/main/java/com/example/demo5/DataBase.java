package com.example.demo5;


import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;

public class DataBase {
    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/apart?serverTimezone=Europe/Kiev";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "root";

    public static int insert(Apart apart) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {

                String sql = "INSERT INTO apart (district, adress, area, rooms, price) VALUES(?,?,?,?,?)";
                try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                    preparedStatement.setString(1, apart.getDistrict());
                    preparedStatement.setString(2, apart.getAddress());
                    preparedStatement.setInt(3, apart.getArea());
                    preparedStatement.setInt(4, apart.getRooms());
                    preparedStatement.setInt(5, apart.getPrice());
                    return preparedStatement.executeUpdate();
                }
            }
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException |
                SQLException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static ArrayList<Apart> select() {
        ArrayList<Apart> apartaments = new ArrayList<Apart>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {
                Statement statement = conn.createStatement();
                String sql = "SELECT * FROM apart";
                ResultSet resultSet = statement.executeQuery(sql);
                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String distr = resultSet.getString(2);
                    String adrs = resultSet.getString(3);
                    int area = resultSet.getInt(4);
                    int rooms = resultSet.getInt(5);
                    int price = resultSet.getInt(6);
                    Apart apart = new Apart(id, distr, adrs, area, rooms, price);
                    apartaments.add(apart);
                }
            }
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException |
                SQLException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return apartaments;
    }


    public static ArrayList<Apart> paramDistr(String param) {
        ArrayList<Apart> apartaments = new ArrayList<Apart>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM apart WHERE district=?");
                ps.setString(1, param);
                ResultSet resultSet = ps.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String distr = resultSet.getString(2);
                    String adrs = resultSet.getString(3);
                    int area = resultSet.getInt(4);
                    int rooms = resultSet.getInt(5);
                    int price = resultSet.getInt(6);
                    Apart apart = new Apart(id, distr, adrs, area, rooms, price);
                    apartaments.add(apart);
                }
            }

        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException |
                SQLException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return apartaments;
    }

    public static ArrayList<Apart> paramStreet(String param) {
        ArrayList<Apart> apartaments = new ArrayList<Apart>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            try (Connection conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD)) {
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM apart WHERE adress=?");
                ps.setString(1, param);
                ResultSet resultSet = ps.executeQuery();

                while (resultSet.next()) {
                    int id = resultSet.getInt(1);
                    String distr = resultSet.getString(2);
                    String adrs = resultSet.getString(3);
                    int area = resultSet.getInt(4);
                    int rooms = resultSet.getInt(5);
                    int price = resultSet.getInt(6);
                    Apart apart = new Apart(id, distr, adrs, area, rooms, price);
                    apartaments.add(apart);
                }
            }
        } catch (InstantiationException | InvocationTargetException | NoSuchMethodException |
                SQLException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return apartaments;
    }


}
