<%-- 
    Document   : index
    Created on : Mar 12, 2016, 11:33:27 AM
    Author     : stephanie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>SCE</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/bootstrap.min.css">
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- jQuery library -->
         <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js"></script>
        <script src="js/jquery-1.12.1.js"></script>
        <script src="js/bootstrap.min.js"></script>  
        <script type="text/javascript" src="js/formValidation.min.js"></script>     
        <!-- Validação Formvalidation -->    
        <script type="text/javascript" src="js/the-framework.js"></script>        
        <script type="text/javascript" src="js/pt_BR.js"></script>        
        
    </head>
    <body>
        <div class="container">
            <div class="jumbotron">
                <nav class="navbar navbar-inverse" style="background-color:#00796B">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <a class="navbar-brand" href="#" style="color:#EEEEEE">SCE</a>
                        </div>
                        <ul class="nav navbar-nav">
                             <li><a href="#" style="color:#EEEEEE">ESCOLAS PARCEIRAS</a></li>
                            <li><a href="ContatosSCE.jsp" style="color:#EEEEEE">CONTATOS</a></li>
                            <li><a href="#" style="color:#EEEEEE">SOBRE</a></li> 
                        </ul>
                    </div>
                </nav>
               <div class="row">
                      <div class="col-md-1" style="padding-left:10px">
                        <div class="row">
                            <div class="col-md-12">
                                <img src="imagens/logo.png" class="logo"/>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-10" style="padding-right:0px; padding-left:30px;">
                        <div class="row">
                            <div class="col-md-12 nome-logo" style="padding-right:10px">
                                <p class="no-padding nome-size"  style="font-size: xx-large;"> Sistema Cantina Escola - SCE </p>
                            </div>
                        </div>
                    </div>                   
                </div>    
               <div class="row">
                    <hr>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="row">
                            <div class="alert alert-success" role="alert" >
                            Inovação. Esta é a palavra-chave para garantir a sobrevivência, o crescimento e o fortalecimento de qualquer negócio. Informatizar sua instituição de ensino é essencial para mantê-la organizada, atualizada e competitiva. Melhorar a qualidade dos serviços prestados também é fundamental para criar diferenciais e assim alcançar o sucesso. Pensando nisso foi que surgiu o SCE. O Sistema de Cantina de Escolas é uma solução específica para instituições que vão desde a Educação Básica até o ensino médio, oferecendo diversas ferramentas de forma modular, ou seja, permitindo que cada instituição componha uma solução adequada ao seu perfil e às suas necessidades.
                            </div>
                        </div>
                    </div>                                       
                <div class="col-md-6 col-lg-push-2">                                   
                             <form id="LoginForm" class="form-horizontal" action="ServletLogin" method="post"> <%-- Tem que adcionar a action que é o servlet que pretende-se usar mais o method   action="ServletLogin" --%> 
                                 <div class="form-group">
                                    <label for="inputEmail3" class="col-sm-2 control-label">Login</label>
                                    <div class="col-sm-10 col-lg-5">
                                        <input type="email" required="true" class="form-control" name="txtLogin" placeholder="Login">
                                    </div>
                                 </div>
                                <div class="form-group">
                                    <label for="inputPassword3" class="col-sm-2 control-label">Senha</label>
                                    <div class="col-sm-10 col-lg-5">
                                        <input type="password" required="true" class="form-control" name="txtPassword" placeholder="Senha">
                                    </div>
                                </div>                         
                               <div class="col-lg-offset-5 col-lg-4">                                                           
                                   <button type="submit" class="btn-primary">Entrar</button>                                                             
                                </div>                               
                            </form>                                         
 <%-- <script>
$(document).ready(function() {
    $('#LoginForm').formvalidation({
        framework: 'bootstrap',
        icon: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
            txtLogin: {
                validators: {
                    notEmpty: {
                        message: 'O login é obrigatório'
                    },
                    regexp: {
                        regexp: /^[a-zA-Z0-9_]+$/,
                        message: 'O login pode conter letras e números.'
                    }
                }
            },
            txtPassword: {
                validators: {
                    notEmpty: {
                        message: 'A senha é obrigatória.'
                    }                
                }
            }
	 }
    });
});
</script>  --%>             
                </div>                
             </div>       
                <div class="row">
                    <hr>
                </div>
            </div>                
        </div> 
    </body>
</html>