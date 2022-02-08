<%--
  Created by IntelliJ IDEA.
  User: Caro
  Date: 31/1/2022
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Administrar Ventas</title>
</head>
<body>
<h1>Lista  Ventas</h1>
<table>
    <tr>
        <td><a href="adminVentas?action=index" >Ir al menú</a> </td>
    </tr>
</table>

<table border="1" width="100%">
    <tr>
        <td>ID</td>
        <td>CODIGO</td>
        <td>PRODUCTO</td>
        <td>DESCRIPCION</td>
        <td>CANTIDAD</td>
        <td>PRECIO</td>
        <td colspan=2>ACCIONES</td>
    </tr>
    <c:forEach var="ventas" items="${lista}">
        <tr>
            <td><c:out value="${ventas.id}"/></td>
            <td><c:out value="${ventas.codigo}"/></td>
            <td><c:out value="${ventas.producto}"/></td>
            <td><c:out value="${ventas.descripcion}"/></td>
            <td><c:out value="${ventas.cantidad}"/></td>
            <td><c:out value="${ventas.precio}"/></td>
            <td><a href="adminVentas?action=showedit&id=<c:out value="${ventas.id}" />">Editar</a></td>
            <td><a href="adminVentas?action=eliminar&id=<c:out value="${ventas.id}"/>">Eliminar</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>