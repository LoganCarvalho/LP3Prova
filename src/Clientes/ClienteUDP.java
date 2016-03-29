/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clientes;

/**
 *
 * @author Logan
 */
import java.io.*; 
import java.net.*; 

public class ClienteUDP {
    
 public static void main(String[] args) throws Exception 
    { 
  
      BufferedReader doUsuario= new BufferedReader(new InputStreamReader(System.in)); 
  
      DatagramSocket socketCliente = new DatagramSocket(); 
  
      InetAddress IPAddress = InetAddress.getByName("nomeHosp"); 
  
      byte[] dadosEnvio = new byte[1024]; 
      byte[] dadosRecebidos = new byte[1024]; 
  
      String frase = doUsuario.readLine(); 
      dadosEnvio = frase.getBytes();         
      DatagramPacket pacoteEnviado = new DatagramPacket(dadosEnvio, dadosEnvio.length,IPAddress, 9876); 
  
      socketCliente.send(pacoteEnviado); 
  
      DatagramPacket pacoteRecebido = new DatagramPacket(dadosRecebidos, dadosRecebidos.length); 
  
      socketCliente.receive(pacoteRecebido); 
  
      String fraseModificada = new String(pacoteRecebido.getData()); 
  
      System.out.println("Do Servidor:" + fraseModificada); 
      socketCliente.close(); 
      } 
} 

    
