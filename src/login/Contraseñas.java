/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Brayan
 */
public class Contraseñas {
    
   public static boolean autenticarUsuario(String usuario, String contraseña) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\Brayan\\Documents\\NetBeansProjects\\Login\\dist\\usuarios.txt"))) {
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] partes = linea.split(",");
                if (partes.length == 3) {
                    String nombre = partes[0];
                    String correo = partes[1];
                    String contraseñaRegistrada = partes[2];

                    if (usuario.equals(nombre) && contraseña.equals(contraseñaRegistrada)) {
                        return true; 
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false; 
    }
}