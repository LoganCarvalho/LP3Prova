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

public class ClienteTCP {
    
  public static void main(String[] args) throws Exception 
    { 
        String firstName, lastName, ano;
        String fraseModificada; 

        BufferedReader doUsuario = new BufferedReader(new InputStreamReader(System.in)); 

        Socket socketCliente = new Socket("172.16.12.60", 6789); 

        DataOutputStream paraServidor = new DataOutputStream(socketCliente.getOutputStream()); 
        BufferedReader doServidor = new BufferedReader(new InputStreamReader(socketCliente.getInputStream())); 
        System.out.println("Informe seu nome:");
        firstName = doUsuario.readLine();
        System.out.println("Informe seu ultimo nome:");
        lastName = doUsuario.readLine();
        System.out.println("Informe seu ano de inclusao:");
        ano = doUsuario.readLine(); 

        paraServidor.writeBytes(firstName + '\n'); 
        paraServidor.writeBytes(lastName + '\n'); 
        paraServidor.writeBytes(ano + '\n'); 
        
        fraseModificada = doServidor.readLine(); 

        System.out.println("Do Servidor: " + fraseModificada); 

        socketCliente.close(); 
                   
    } 

    
}