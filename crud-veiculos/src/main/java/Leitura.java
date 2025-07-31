
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Administrador
 */
public class Leitura {
    
    public String entDados(String rotulo) {
        
        System.out.println(rotulo);
        
        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(teclado);
        
        String ret = "";
        
        try {
            ret = bufferedReader.readLine();
        } catch (IOException ex) {
            System.out.println("\nErro  no sistema: RAM - TECLADO");
        }
        
        return ret;
        
    }
    
}
