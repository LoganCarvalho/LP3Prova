package controllerCoelba;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.beanCoelba.Cliente;
import model.daoCoelba.ClienteDao;

@WebServlet(name = "ClienteController", urlPatterns = {"/ClienteController"})
public class ClienteController extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
        Cliente cliente = new Cliente();
        ClienteDao ClienteDao = new ClienteDao();
        
        cliente.setCpf(request.getParameter("cpf"));
        cliente.setNome(request.getParameter("nome"));
        cliente.setTelefone(request.getParameter("telefone"));
        cliente.setEmail(request.getParameter("email"));
        cliente.setCep(request.getParameter("cep"));
        cliente.setNumero(Integer.parseInt(request.getParameter("numero")));
        ClienteDao.inserir(cliente);
        
        request.setAttribute("cliente", cliente);

        RequestDispatcher dispatcher = request.getRequestDispatcher("sucesso.jsp");
        dispatcher.forward(request, response);
     
    }

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    } 

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
