package Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ConexiónDB {
    public static void main(String[] args) {
        try {
            //Crear conexion
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/conexiondb?useSSL=false&serverTimezone=UTC", "caroatam" ,
                    "40975241" );

            //Crear obj Statement
            Statement statement = con.createStatement();

            //Ejecutar SQL
            Scanner sc = new Scanner(System.in);
            int id = sc.nextInt();
            ResultSet resSet = statement.executeQuery("SELECT * FROM gente WHERE id=" + id);

            //Leer ResultSet
            while(resSet.next()){
                System.out.println(resSet.getString("name"));
            }

        } catch (Exception ex) {
            System.err.println("FALLASTE");
            System.out.println(ex.getMessage() + "\n" +  ex.getClass() + "\n" +  ex.getStackTrace());
        }
    }
}

