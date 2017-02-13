/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package JavaServer;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;/**
 *
 * @author SyedSumair
 */


public class JavaServer {

    /**
     * @param args the command line arguments
     */
    public static void main() {
        
        try {
            ServerSocket server = new ServerSocket(3496);

            System.out.println("Server Start on pot 3496");
            
            while(true) {
                Socket client = server.accept();

                // Code to read client response
                /*                
                InputStream in = client.getInputStream();
                
                byte[] buffer = new byte[1024];
                int read;
                while((read = in.read(buffer)) != -1) {
                    String output = new String(buffer, 0, read);
                    System.out.print(output);
                    System.out.flush();
                };
                */
                
                // Sending client data
                OutputStream out = client.getOutputStream();
                byte[] b = ("Hello Sumair \n\r").getBytes("UTF-8");
                
                while(true) {
                    out.write(b);                    
                }
            }            
        } catch(Exception e) {
            System.out.println(e.getMessage());                    
        }

        System.out.println("End of program...");
    }

}
