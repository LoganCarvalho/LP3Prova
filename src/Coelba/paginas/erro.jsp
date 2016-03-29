<%-- 
    Document   : erro
    Created on : 12/11/2014, 10:38:32
    Author     : Thamires
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensagem de Solicitação</title>
    </head>
    <body>
         <form>
             <% model.bean.Cliente cliente = (model.bean.Cliente) request.getAttribute("cliente");%>
            <% if(cliente == null)%><%{%>
                <p><input type="text" name="nome" value="Erro na Solicitação">
            <%}%>
        </form>
    </body>
</html>
