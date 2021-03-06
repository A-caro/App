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
    <title>Administrar Art?culos</title>
</head>
<body>
<h1>Lista  Art?culos</h1>
<table>
    <tr>
        <td><a href="adminArticulo?action=index" >Ir al men?</a> </td>
    </tr>
</table>

<table border="1" width="100%">
    <tr>
        <td>ID</td>
        <td>CODIGO</td>
        <td>NOMBRE</td>
        <td>DESCRIPCION</td>
        <td>EXISTENCIA</td>
        <td>PRECIO</td>
        <td colspan=2>ACCIONES</td>
    </tr>
    <c:forEach var="articulo" items="${lista}">
        <tr>
            <td><c:out value="${articulo.Id}"/></td>
            <td><c:out value="${articulo.codigo}"/></td>
            <td><c:out value="${articulo.nombre}"/></td>
            <td><c:out value="${articulo.descripcion}"/></td>
            <td><c:out value="${articulo.existencia}"/></td>
            <td><c:out value="${articulo.precio}"/></td>
            <td><a href="adminArticulo?action=showedit&id=<c:out value="${articulo.Id}" />">Editar</a></td>
            <td><a href="adminArticulo?action=eliminar&id=<c:out value="${articulo.Id}"/>">Eliminar</a> </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>