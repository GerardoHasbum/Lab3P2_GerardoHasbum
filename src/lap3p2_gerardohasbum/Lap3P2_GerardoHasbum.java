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

        while (res_men > 0 && res_men < 7) {//while menu

            System.out.println("*****MENU*****"
                    + "\n1. CREAR POKEMON"
                    + "\n2. CREAR POKEBOLA"
                    + "\n3. LISTAR POKEMON"
                    + "\n4. ELIMINAR POKEMON"
                    + "\n5. CAPTURAR POKEMON"
                    + "\n6. MODIFICAR POKEMON"
                    + "\n7. SALIR"
                    + "\nIngrese su opcion: ");

            res_men = jhin.nextInt();

            if (res_men == 1) {//crear pokemon

                System.out.println("Ingrese el nombre del pokemon: ");
                jhin.nextLine();
                String nombre = jhin.nextLine();
                boolean existe = false;
                Pokemon temporal = new Pokemon();
                for (int i = 0; i < pkmn.size(); i++) {//validacion de pokemon existente
                    String temp = pkmn.get(i).getNombre();
                    if (temp.equals(nombre)) {
                        existe = true;
                        temporal = pkmn.get(i);
                    }
                }

                if (existe == false) {//creacion de pokemon nuevo
                    System.out.println("Ingrese el numero de entrada del pokemon: ");
                    int entrada = jhin.nextInt();

                    for (int i = 0; i < pkmn.size(); i++) {//validacion de indice en el pokedex
                        while (pkmn.get(i).getEntrada() == entrada) {
                            System.out.println("Ese indice ya esta tomado por otro pokemon porfavor eleigr otro: ");
                            entrada = jhin.nextInt();
                        }
                    }

                    System.out.println("Ingrese la naturaleza de este pokemon[Timido,Energetico,Misterioso]: ");
                    jhin.nextLine();
                    String naturaleza = jhin.nextLine();
                    naturaleza = naturaleza.toLowerCase();
                    while (!(naturaleza.equals("timido")) && !(naturaleza.equals("energetico")) && !(naturaleza.equals("misterioso"))) {
                        System.out.println("Esa naturaleza no existe, porfavor ingresar otra[Timido,Energetico,Misterioso]: ");
                        naturaleza = jhin.nextLine();
                        naturaleza = naturaleza.toLowerCase();
                    }

                    System.out.println("Ingrese que tipo de pokemon es: "
                            + "\n1. FUEGO"
                            + "\n2. AGUA"
                            + "\n3. PLANTA");

                    int tipo = jhin.nextInt();
                    
                    switch (tipo) {
                        
                        case 1:
                            
                            System.out.println("Ingrese la potencia de las llamas: ");
                            int potencia = jhin.nextInt();
                            
                            pkmn.add(new Fire(potencia, nombre, entrada, naturaleza));
                            
                            break;
                        
                        case 2:
                            
                            System.out.println("Puede vivir afuera del agua?[s/n]: ");
                            char res = jhin.next().charAt(0);
                            boolean vive = false;
                            if (res == 's' || res == 'S') {
                                vive = true;
                            }
                            
                            System.out.println("Ingrese la velocidad del pokemon en el agua: ");
                            int velocidad = jhin.nextInt();
                            
                            pkmn.add(new Water(vive, velocidad, nombre, entrada, naturaleza));
                            
                            break;
                        
                        case 3:
                            
                            System.out.println("Ingrese el habitat del pokemon: ");
                            jhin.nextLine();
                            String habitat = jhin.nextLine();
                            
                            System.out.println("Ingrese el dominio sobre las plantas del pokemon[0-100]: ");
                            int dominio = jhin.nextInt();
                            while (dominio < 0 || dominio > 100) {
                                System.out.println("Ese dominio sobre las plantas no es posible, porfavor ingresar uno posible[0-100]: ");
                                dominio = jhin.nextInt();
                            }
                            pkmn.add(new Grass(habitat, dominio, nombre, entrada, naturaleza));
                            
                            break;
                        
                    }
                }
                
                if (existe == true) {
                    
                }

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
