package org.adaitw.app_crud.dao;

import org.adaitw.app_crud.model.Ventas;
import org.adaitw.app_crud.model.Conexion;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class VentasDao {
    private Conexion con;
    private Connection connection;

    public VentasDao(String jdbcURL, String jdbcUsername, String jdbcPassword) throws SQLException {
        System.out.println(jdbcURL);
        con = new Conexion(jdbcURL, jdbcUsername, jdbcPassword);
    }

    // insertar artÃ­culo
    public boolean insertar(Ventas ventas) throws SQLException {
        String sql = "INSERT INTO ventas (id, codigo, producto, descripcion, cantidad, precio) VALUES (?, ?, ?,?,?,?)";
        System.out.println(ventas.getDescripcion());
        con.conectar();
        connection = con.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, null);
        statement.setString(2, ventas.getCodigo());
        statement.setString(3, ventas.getProducto());
        statement.setDouble(4, ventas.getPrecio());
        statement.setString(5, ventas.getDescripcion());
        statement.setDouble(6, ventas.getCantidad());

        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
        con.desconectar();
        return rowInserted;
    }

    // listar todos los productos
    public List<Ventas> listarVentas() throws SQLException {

        List<Ventas> listaVentas = new ArrayList<Ventas>();
        String sql = "SELECT * FROM ventas";
        con.conectar();
        connection = con.getJdbcConnection();
        Statement statement = connection.createStatement();
        ResultSet resulSet = statement.executeQuery(sql);

        while (resulSet.next()) {
            int id = resulSet.getInt("id");
            String codigo = resulSet.getString("codigo");
            String producto = resulSet.getString("producto");
            double cantidad = resulSet.getDouble("cantidad");
            String descripcion = resulSet.getString("descripcion");
            double precio = resulSet.getDouble("precio");
            Ventas ventas = new Ventas(id,codigo,producto, descripcion,cantidad,  precio);
            listaVentas.add(ventas);
        }
        con.desconectar();
        return listaVentas;
    }

    // obtener por id
    public Ventas obtenerPorId(int id) throws SQLException {
        Ventas ventas = null;

        String sql = "SELECT * FROM ventas WHERE id= ? ";
        con.conectar();
        connection = con.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, id);

        ResultSet res = statement.executeQuery();
        if (res.next()) {
            ventas = new Ventas(res.getInt("id"), res.getString("codigo"), res.getString("producto"),
                    res.getString("descripcion"), res.getDouble("cantidad"), res.getDouble("precio"));
        }
        res.close();
        con.desconectar();

        return ventas;
    }
    // actualizar
    public boolean actualizar(Ventas ventas) throws SQLException {
        boolean rowActualizar = false;
        String sql = "UPDATE ventas SET codigo=?,producto=?,descripcion=?,cantidad=?, precio=? WHERE id=?";
        con.conectar();
        connection = con.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, ventas.getCodigo());
        statement.setString(2, ventas.getProducto());
        statement.setString(3, ventas.getDescripcion());
        statement.setDouble(4, ventas.getCantidad());
        System.out.println(ventas.getPrecio());
        statement.setDouble(5, ventas.getPrecio());
        statement.setInt(6, ventas.getId());

        rowActualizar = statement.executeUpdate() > 0;
        statement.close();
        con.desconectar();
        return rowActualizar;
    }

    //eliminar
    public boolean eliminar(Ventas ventas) throws SQLException {
        boolean rowEliminar = false;
        String sql = "DELETE FROM ventas WHERE ID=?";
        con.conectar();
        connection = con.getJdbcConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setInt(1, ventas.getId());

        rowEliminar = statement.executeUpdate() > 0;
        statement.close();
        con.desconectar();

        return rowEliminar;
    }
}
