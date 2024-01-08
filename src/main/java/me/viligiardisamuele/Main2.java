package me.viligiardisamuele;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Main2 {
    public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
        Classe c2 = new XmlMapper().readValue(new File("test.xml"), Classe.class);
        System.out.println("c2: " + c2.aula + " - " + c2.numero + " - " + c2.sezione);
    }
}
