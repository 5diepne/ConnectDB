<%-- 
    Document   : index
    Created on : Jan 29, 2024, 3:58:14 PM
    Author     : DiepTCNN
--%>

<%@page import="controller.ClassStu"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.ClassStudent" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LIST OF CLASSES > 31</h1>
        <table border="1px">
            <tr>
                <th>Class ID</th>
                <th>Name</th>
                <th>NumOfStudent</th>
            </tr>
            <%
                List<ClassStudent> list = (List<ClassStudent>) request.getAttribute("list"); 
                if (list != null) {
                    for (ClassStudent y : list) {
            %>
            <tr>
                <td><%= y.getId()%></td>
                <td><%= y.getName()%></td>
                <td><%= y.getNumber()%></td>
            </tr>
            <%                    
                    }
                }
            %>
        </table>
    </body>
</html>
