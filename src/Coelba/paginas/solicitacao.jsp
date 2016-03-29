<%-- 
    Document   : solicitacao
    Created on : 12/11/2014, 10:20:52
    Author     : Thamires
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitação de Ligação de Energia</title>
    </head>
    <body>
        <h1>Solicitação de Ligação de Energia</h1>
        <form  name="formulario" action="ClienteController"  method="post" >
        <p>CPF:
            <input type="text" name="cpf" size="15">
        <p>Nome:
            <input type="text" name="nome" size="15">
        <p>Telefone:
            <input type="text" name="telefone" size="15">
         <p>Email:
            <input type="text" name="email" size="15">
        <p>CEP:
            <input type="text" name="cep" size="15">
        <p>Numero da Residencia:
            <input type="text" name="numero" size="15">
            <input type="submit" value="Enviar">
            <input type="reset"  value="Limpar">
    </form>
    </body>
</html>
