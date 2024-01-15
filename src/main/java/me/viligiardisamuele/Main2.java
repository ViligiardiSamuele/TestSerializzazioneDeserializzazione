package me.viligiardisamuele;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

import com.fasterxml.jackson.databind.ObjectMapper;


public class Main2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 8080);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String input = in.readLine();
            ObjectMapper objectMapper = new ObjectMapper();
            Classe c1 = objectMapper.readValue(input, Classe.class);
            System.out.println(c1.toString());

            socket.close();
            in.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
