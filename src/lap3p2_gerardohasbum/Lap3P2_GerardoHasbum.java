/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap3p2_gerardohasbum;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author ghasb
 */
public class Lap3P2_GerardoHasbum {

    /**
     * @param args the command line arguments
     */
    static Scanner jhin = new Scanner(System.in);
static Random crit = new Random();

    public static void main(String[] args) {
        
        int res_men = 1;
        ArrayList<Pokemon> pkmn = new ArrayList();
        ArrayList<Pokebola> pkbl = new ArrayList();
        
        while (res_men > 0 && res_men<7) {//while menu
            
            System.out.println("*****MENU*****"
                    + "\n1. CREAR POKEMON"
                    + "\n2. CREAR POKEBOLA"
                    + "\n3. LISTAR POKEMON"
                    + "\n4. ELIMINAR POKEMON"
                    + "\n5. CAPTURAR POKEMON"
                    + "\n6. MODIFICAR POKEMON"
                    + "\n7. SALIR");
            
            res_men = jhin.nextInt();
            
            if (res_men == 1) {//crear pokemon
                
                
                
            }//fin crear pokemon
            
            if (res_men == 2) {//crear pokebola
                
                
                
            }//fin crear pokebola
            
            if (res_men == 3) {//listar pokemon
                
                
                
            }//fin listar pokemon
            
            if (res_men == 4) {//eliminar pokemon
                
                
                
            }//fin eliminar pokemon
            
            if (res_men == 5) {//capturar pokemon
                
                
                
            }//fin capturar pokemon
            
            if (res_men == 6) {//modificar pokemon
                
                
                
            }//fin modificar pokemon
            
            
        }//fin while menu
        
    }//fin main
    
}//fin clase
