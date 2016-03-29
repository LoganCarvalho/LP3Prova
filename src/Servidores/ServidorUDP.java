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

public class ServidorUDP {
  public static void main(String[] args) throws Exception 
    { 
  
      DatagramSocket socketServidor = new DatagramSocket(9876); 
  
      byte[] dadosRecebidos = new byte[1024]; 
      byte[] dadosEnviados  = new byte[1024]; 
  
      while(true) 
        { 
            DatagramPacket pacoteRecebido = 
             new DatagramPacket(dadosRecebidos, 
		dadosRecebidos.length); 
             socketServidor.receive(pacoteRecebido); 
             String frase = new String(pacoteRecebido.getData()); 
  
          InetAddress IPAddress = pacoteRecebido.getAddress(); 
  
          int porta = pacoteRecebido.getPort(); 
  
          String fraseEmMaiusculas = frase.toUpperCase(); 

          dadosEnviados = fraseEmMaiusculas.getBytes(); 
  
          DatagramPacket pacoteEnviado = 
             new DatagramPacket(dadosEnviados, 
                        dadosEnviados.length, IPAddress, porta); 
  
          socketServidor.send(pacoteEnviado); 
        } 
    } 
}  

