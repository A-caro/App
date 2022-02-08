package Demo;

import java.sql.*;

public class MySql {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static Connection conn = null;
    static final String DB_URL = "jdbc:mysql://localhost:3306/conexiondb?useSSL=false&serverTimezone=UTC";
    static final String USER = "caroatam";
    static final String PASS ="40975241";

    public MySql(){
        try {
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.print("Conexión hacia la base de datos exitosa");
        } catch (SQLException e){
            //TODO auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        MySql conn2 = new MySql();

    }


}
