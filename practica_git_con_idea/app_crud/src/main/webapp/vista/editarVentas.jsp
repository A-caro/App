<%--
  Created by IntelliJ IDEA.
  User: Caro
  Date: 31/1/2022
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Actualizar Ventas</title>
</head>
<body>
<h1>Actualizar Ventas</h1>
<form action="adminVentas?action=editar" method="post" >
    <table>
        <tr>
            <td><label>Id</label></td>
            <td><input type="text" name="id" value="<c:out value="${ventas.id}"></c:out>" ></td>
        </tr>
        <tr>
            <td><label>Código</label></td>
            <td><input type="text" name="codigo" value='<c:out value="${ventas.codigo}"></c:out>' ></td>
        </tr>
        <tr>
            <td><label>Producto</label></td>
            <td><input type="text" name="producto" value='<c:out value="${ventas.producto}"></c:out>' ></td>
        </tr>
        <tr>
            <td><label>Descripción</label></td>
            <td><input type="text" name="descripcion" value='<c:out value="${ventas.descripcion}"></c:out>' ></td>
        </tr>
        <tr>
            <td><label>cantidad</label></td>
            <td><input type="text" name="cantidad" value='<c:out value="${ventas.cantidad }"></c:out>' ></td>
        </tr>

        <tr>
            <td><label>Precio</label></td>
            <td><input type="text" name="precio" value='<c:out value="${ventas.precio }"></c:out>' ></td>
        </tr>
    </table>

    <input type="submit" name="registrar" value="Guardar">
</form>

</body>
</html>