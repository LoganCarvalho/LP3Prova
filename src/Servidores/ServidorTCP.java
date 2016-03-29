/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servidores;

/**
 *
 * @author Logan
 */
import java.io.*; 
import java.net.*; 
import java.util.ArrayList;

public class ServidorTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    { 
      String  firstName, lastName, ano;
      String senha; 
      int cont=0;
      int port = 6789;
         
      ArrayList<Socket> Clientes = new ArrayList<Socket>(2);
        
      while(true) { 
          
           System.out.println("Aguardando solicitacao ");
            //A porta que o servidor está escutando
           ServerSocket socketRecepcao = new ServerSocket(port); 
           Socket cliente1 = socketRecepcao.accept(); 
           
           //server.accept retorna uma conexão com o cliente
           Clientes.add(cliente1);
           
           cont++;
           System.out.println("Atendendo solicitacao " + cont);
           
           BufferedReader doCliente = new BufferedReader(new InputStreamReader(cliente1.getInputStream())); 
           DataOutputStream  paraCliente = new DataOutputStream(cliente1.getOutputStream()); 

           firstName= doCliente.readLine(); 
           lastName= doCliente.readLine(); 
           ano= doCliente.readLine(); 

           senha= ("Sua senha é :" + firstName+ "."+lastName+"."+ano+"\n");
           
          System.out.println(senha);

           paraCliente.writeBytes(senha); 
        } 
    }
}
