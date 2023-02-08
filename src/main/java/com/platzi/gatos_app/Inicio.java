/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.gatos_app;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author THINKBOOK
 */
public class Inicio {
    
    public static void main(String[] args) throws IOException{
        int opcionMenu = -1;
        String[] botones = {
            "1. Ver gatos",
            "2. Ver favoritos",
            "3. Salir"
        };
        
        do{
            //Menu principal
            String opcion = (String) JOptionPane.showInputDialog(null, "Gatitos Java", "Menu Principal", JOptionPane.INFORMATION_MESSAGE,
                    null, botones, botones[0]);
            
            //Validamos que opcion selecciona el usuario
            for(int i=0;i<botones.length;i++){
                if(opcion.equals(botones[i])){
                    opcionMenu = i;
                }
            }
            
            switch(opcionMenu){
                case 0:
                    GatosService.verGatos();
                    break;
                case 1:
                    Gatos gato = new Gatos();
                    GatosService.verFavorito(gato.getApikey());
                default:
                    break;
            }
        }while(opcionMenu != 1);
    }
}
