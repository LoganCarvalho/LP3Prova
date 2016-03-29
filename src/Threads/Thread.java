/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Logan
 */

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here

        Thread p1 = new Thread(1);
        p1.start();
       
        Thread p2 = new Thread(2);
        p2.start();
      }
    }

public class Thread extends Thread {

    private int id;

    public Thread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Programa " + id + "      valor " + i);
            }
            catch(Exception e){}
        }
    }
}
