package me.viligiardisamuele;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main1 
{
    public static void main( String[] args ) throws StreamWriteException, DatabindException, IOException
    {

        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("Server avviato");

        Socket socket = serverSocket.accept();
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());

        Alunno a1 = new Alunno("Roberto", "Lavagna", new Date(2000,5,15));
        Alunno a2 = new Alunno("Giovanni", "Gesso", new Date(2001,7,1));
        Alunno a3 = new Alunno("Leonardo", "Cimosa", new Date(2000,2,20));
        Alunno a4 = new Alunno("Tizio", "Polvere", new Date(2000,3,20));

        List<Alunno> l1 = new ArrayList<Alunno>();
        l1.add(a1);
        l1.add(a2);
        l1.add(a3);
        l1.add(a4);
        Classe c1 = new Classe(5, "AIA", "04-TC", l1);

        ObjectMapper objectMapper = new ObjectMapper();
        String outString = objectMapper.writeValueAsString(c1);
        out.writeBytes(outString);
        System.out.println(socket.getPort() + " - Invio di: " + outString);
    }
}
