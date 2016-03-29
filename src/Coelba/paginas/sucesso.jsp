<%-- 
    Document   : Exibir
    Created on : 05/11/2014, 21:20:19
    Author     : Thamires
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mensagem de Solicitação</title>
    </head>
    <body>
        <form>
             <% model.bean.Cliente cliente = (model.bean.Cliente) request.getAttribute("cliente");%>
            <% if(cliente != null)%><%{%>
                <p><input type="text" name="nome" value="Sucesso na Solicitação">
            <%}%>
        </form>
    </body>
</html>
