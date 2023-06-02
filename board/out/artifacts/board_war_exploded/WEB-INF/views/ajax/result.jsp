<%@ page contentType="text/plain;charset=UTF-8" language="java" %>
<%
boolean usable =(boolean) request.getAttribute("result");
%>

{
    "usable": "<%=usable%>"
}

