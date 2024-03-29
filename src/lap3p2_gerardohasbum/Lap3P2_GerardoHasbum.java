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
        ArrayList pkmn = new ArrayList();
        //para validar ciertas cosas
        pkmn.add(new Fire(0, "char", 3, "Timido"));
        pkmn.add(new Water(true, 0, "squirt", 2, "Energetico"));
        pkmn.add(new Grass("Bosque", 0, "bulb", 1, "misterioso"));
        ArrayList<Pokebola> pkbl = new ArrayList();
        //para validar ciertas cosas
        pkbl.add(new Pokebola("Negro", "Ultra3", 3));
        pkbl.add(new Pokebola("Azul", "Great2", 2));
        pkbl.add(new Pokebola("Rojo", "Basic1", 1));

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
                    Pokemon tem = (Pokemon) pkmn.get(i);
                    String temp = tem.getNombre();
                    if (temp.equals(nombre)) {
                        existe = true;
                        temporal = tem;
                    }
                }

                if (existe == false) {//creacion de pokemon nuevo
                    System.out.println("Ingrese el numero de entrada del pokemon: ");//indice de entrada del pokedex
                    int entrada = jhin.nextInt();

                    for (int i = 0; i < pkmn.size(); i++) {//validacion de indice en el pokedex
                        Pokemon tem = (Pokemon) pkmn.get(i);
                        while (tem.getEntrada() == entrada) {
                            System.out.println("Ese indice ya esta tomado por otro pokemon porfavor eleigr otro: ");
                            entrada = jhin.nextInt();
                        }
                    }

                    System.out.println("Ingrese la naturaleza de este pokemon[Timido,Energetico,Misterioso]: ");//naturaleza del pokemon
                    jhin.nextLine();
                    String naturaleza = jhin.nextLine();
                    naturaleza = naturaleza.toLowerCase();
                    while (!(naturaleza.equals("timido")) && !(naturaleza.equals("energetico")) && !(naturaleza.equals("misterioso"))) {//validacion de existencia de naturaleza
                        System.out.println("Esa naturaleza no existe, porfavor ingresar otra[Timido,Energetico,Misterioso]: ");
                        naturaleza = jhin.nextLine();
                        naturaleza = naturaleza.toLowerCase();
                    }

                    System.out.println("Ingrese que tipo de pokemon es: "//tipo del pokemon
                            + "\n1. FUEGO"
                            + "\n2. AGUA"
                            + "\n3. PLANTA");

                    int tipo = jhin.nextInt();

                    switch (tipo) {//asignacion de cualidades por tipo

                        case 1://pokemon tipo fuego

                            System.out.println("Ingrese la potencia de las llamas: ");//potencia de llamas del tipo fuego
                            int potencia = jhin.nextInt();

                            pkmn.add(new Fire(potencia, nombre, entrada, naturaleza));

                            break;

                        case 2://pokemon tipo agua

                            System.out.println("Puede vivir afuera del agua?[s/n]: ");//habilidad para vivir afuera del agua del tipo agua
                            char res = jhin.next().charAt(0);
                            boolean vive = false;
                            if (res == 's' || res == 'S') {
                                vive = true;
                            }

                            System.out.println("Ingrese la velocidad del pokemon en el agua: ");//velocidad en el agua del tipo agua
                            int velocidad = jhin.nextInt();

                            pkmn.add(new Water(vive, velocidad, nombre, entrada, naturaleza));

                            break;

                        case 3://pokemon tipo planta

                            System.out.println("Ingrese el habitat del pokemon: ");//habitat del pokemon tipo planta
                            jhin.nextLine();
                            String habitat = jhin.nextLine();

                            System.out.println("Ingrese el dominio sobre las plantas del pokemon[0-100]: ");//dominio sobre las plantas del pokemon tipo planta
                            int dominio = jhin.nextInt();
                            while (dominio < 0 || dominio > 100) {//validacion de dominio sobre las plantas
                                System.out.println("Ese dominio sobre las plantas no es posible, porfavor ingresar uno posible[0-100]: ");
                                dominio = jhin.nextInt();
                            }

                            pkmn.add(new Grass(habitat, dominio, nombre, entrada, naturaleza));

                            break;

                    }
                }

                if (existe == true) {//Creacion de pokemon existente
                    if (temporal instanceof Fire) {//si ya existe y es fuego

                        System.out.println("Ingrese la naturaleza del pokemon[Timido,Energetico,Misterioso]: ");//naturaleza del pokemon
                        String naturaleza = jhin.nextLine();
                        naturaleza = naturaleza.toLowerCase();
                        while (!(naturaleza.equals("timido")) && !(naturaleza.equals("energetico")) && !(naturaleza.equals("misterioso"))) {//validacion de existencia de la naturaleza
                            System.out.println("Esa naturaleza no existe, porfavor ingresar otra[Timido,Energetico,Misterioso]: ");
                            naturaleza = jhin.nextLine();
                            naturaleza = naturaleza.toLowerCase();
                        }

                        System.out.println("Ingrese la potencia de las llamas del pokemon: ");//potencia de las llamas del pokemon tipo fuego
                        int potencia = jhin.nextInt();

                        pkmn.add(new Fire(potencia, temporal.getNombre(), temporal.getEntrada(), naturaleza));

                    }

                    if (temporal instanceof Water) {//si ya existe y es agua

                        System.out.println("Ingrese la naturaleza de este pokemon[Timido,Energetico,Misterioso]: ");//naturaleza del pokemon
                        String naturaleza = jhin.nextLine();
                        naturaleza = naturaleza.toLowerCase();
                        while (!(naturaleza.equals("timido")) && !(naturaleza.equals("energetico")) && !(naturaleza.equals("misterioso"))) {
                            System.out.println("Esa naturaleza no existe, porfavor ingresar otra[Timido,Energetico,Misterioso]: ");
                            naturaleza = jhin.nextLine();
                            naturaleza = naturaleza.toLowerCase();
                        }

                        System.out.println("Puede vivir afuera del agua?[s/n]: ");//habilidad para vivir afuera del agua del tipo agua
                        char res = jhin.next().charAt(0);
                        boolean vive = false;
                        if (res == 's' || res == 'S') {
                            vive = true;
                        }

                        System.out.println("Ingrese la velocidad del pokemon en el agua: ");//velocidad en el agua del tipo agua
                        int velocidad = jhin.nextInt();

                        pkmn.add(new Water(vive, velocidad, temporal.getNombre(), temporal.getEntrada(), naturaleza));

                    }

                    if (temporal instanceof Grass) {//si ya existe y es planta

                        System.out.println("Ingrese la naturaleza de este pokemon[Timido,Energetico,Misterioso]: ");//naturaleza del pokemon
                        String naturaleza = jhin.nextLine();
                        naturaleza = naturaleza.toLowerCase();
                        while (!(naturaleza.equals("timido")) && !(naturaleza.equals("energetico")) && !(naturaleza.equals("misterioso"))) {
                            System.out.println("Esa naturaleza no existe, porfavor ingresar otra[Timido,Energetico,Misterioso]: ");
                            naturaleza = jhin.nextLine();
                            naturaleza = naturaleza.toLowerCase();
                        }

                        System.out.println("Ingrese el habitat del pokemon: ");//habitat del pokemon tipo planta
                        String habitat = jhin.nextLine();

                        System.out.println("Ingrese el dominio sobre las plantas del pokemon[0-100]: ");//dominio sobre las plantas del pokemon tipo planta
                        int dominio = jhin.nextInt();
                        while (dominio < 0 || dominio > 100) {//validacion sobre el dominio de las plantas
                            System.out.println("Ese dominio sobre las plantas no es posible, porfavor ingresar uno posible[0-100]: ");
                            dominio = jhin.nextInt();
                        }

                        pkmn.add(new Grass(habitat, dominio, temporal.getNombre(), temporal.getEntrada(), naturaleza));

                    }
                }

                System.out.println("Pokemon creado");
                System.out.println();

            }//fin crear pokemon

            if (res_men == 2) {//crear pokebola

                System.out.println("Ingrese el color de la pokebola: ");
                jhin.nextLine();
                String color = jhin.nextLine();

                System.out.println("Ingrese el numero de serie: ");
                String serie = jhin.nextLine();
                boolean existe = false;
                for (int i = 0; i < pkbl.size(); i++) {
                    if (pkbl.get(i).getSerie().equals(serie)) {
                        existe = true;
                    }
                }
                while (existe == true) {
                    System.out.println("Esa serie ya existe porfavor ingresar otra: ");
                    serie = jhin.nextLine();
                    for (int i = 0; i < pkbl.size(); i++) {
                        existe = false;
                        if (pkbl.get(i).getSerie().equals(serie)) {
                            existe = true;
                            continue;
                        }
                    }
                }

                System.out.println("Ingrese la eficiencia de la pokebola[1-3]: ");
                int eficiencia = jhin.nextInt();
                while (eficiencia < 1 || eficiencia > 3) {
                    System.out.println("Ese valor de eficiencia no existe, porfavor ingresar otro[1-3]: ");
                    eficiencia = jhin.nextInt();
                }

                pkbl.add(new Pokebola(color, serie, eficiencia));

                System.out.println("Pokebola creada");
                System.out.println();

            }//fin crear pokebola

            if (res_men == 3) {//listar pokemon

                pkmn = Ordenamiento(pkmn);//ordenacion
                PrintA(pkmn);//tipos ordenados impresos
                System.out.println();

            }//fin listar pokemon

            if (res_men == 4) {//eliminar pokemon

                System.out.println("Ingrese el tipo de pokemon que desea eliminar: "//seleccion de tipo
                        + "\n1. FUEGO"
                        + "\n2. AGUA"
                        + "\n3. PLANTA");

                int tipo = jhin.nextInt();

                while (tipo < 1 || tipo > 3) {//validacion de tipo
                    System.out.print("Ese tipo no existe porfavor elegir uno existente: ");
                    tipo = jhin.nextInt();
                }

                if (tipo == 1) {//si fuego
                    for (int i = 0; i < pkmn.size(); i++) {
                        if (pkmn.get(i) instanceof Fire) {
                            System.out.println(i + ".- " + pkmn.get(i).toString());
                        }
                    }
                }
                if (tipo == 2) {//si agua
                    for (int i = 0; i < pkmn.size(); i++) {
                        if (pkmn.get(i) instanceof Water) {
                            System.out.println(i + ".- " + pkmn.get(i).toString());
                        }
                    }
                }
                if (tipo == 3) {//si planta
                    for (int i = 0; i < pkmn.size(); i++) {
                        if (pkmn.get(i) instanceof Grass) {
                            System.out.println(i + ".- " + pkmn.get(i).toString());
                        }
                    }
                }

                System.out.println("Ingrese el indice(x.- ) del pokemon que desea eliminar: ");//se ponen oscuras las cosas

                int elimpos = jhin.nextInt();

                if (elimpos > pkmn.size() - 1 || elimpos < 0) {//validacion de posicion
                    System.out.println("Ese valor no existe en la lista");
                    continue;
                }
                if (pkmn.get(elimpos) instanceof Fire) {//validacion si la posicion es del tipo eleigido
                    if (tipo == 1) {
                        pkmn.remove(elimpos);
                    } else {
                        System.out.println("fuego");
                        System.out.println("Ese pokemon no es del tipo especificado");
                        continue;
                    }
                } else if (pkmn.get(elimpos) instanceof Water) {
                    if (tipo == 2) {
                        pkmn.remove(elimpos);
                    } else {
                        System.out.println("Ese pokemon no es del tipo especificado");
                        continue;
                    }
                } else if (pkmn.get(elimpos) instanceof Grass) {
                    if (tipo == 3) {
                        pkmn.remove(elimpos);
                    } else {
                        System.out.println("Ese pokemon no es del tipo especificado");
                        continue;
                    }
                }

            }//fin eliminar pokemon

            if (res_men == 5) {//capturar pokemon

                int pospok = crit.nextInt(pkmn.size());
                Pokemon pok = (Pokemon) pkmn.get(pospok);
                while (pok.isCatched() == true) {
                    pospok = crit.nextInt(pkmn.size());
                    pok = (Pokemon) pkmn.get(pospok);
                }
                System.out.println("EL POKEMON " + pok.getNombre() + " HA APARECIDO");

                while (pok.isCatched() == false) {

                    PrintA(pkbl);

                    System.out.println("Ingrese el indice(x.- ) de la pokebola que quiere usar: ");
                    int posball = jhin.nextInt();

                    while (posball > pkbl.size() - 1 || posball < 0) {
                        System.out.print("Ese indice no esta en la lista porfavor ingresar uno que si este: ");
                        posball = jhin.nextInt();
                    }

                    Pokebola temp = pkbl.get(posball);
                    pkbl.remove(posball);

                    if (temp.getEficiencia() == 3) {
                        System.out.println("EL POKEMON A SIDO ATRAPDO");
                        ((Pokemon) pkmn.get(pospok)).setCatched(true);
                        ((Pokemon) pkmn.get(pospok)).setPkblCatched(temp);
                        pok.setCatched(true);
                    } else if (temp.getEficiencia() == 2) {
                        int x = 1 + crit.nextInt(3);
                        if (x == 3 || x == 2) {
                            System.out.println("EL POKEMON A SIDO ATRAPDO");
                            ((Pokemon) pkmn.get(pospok)).setCatched(true);
                            ((Pokemon) pkmn.get(pospok)).setPkblCatched(temp);
                            pok.setCatched(true);
                        } else {
                            System.out.println("EL POKEMON SE HA ESCAPADO DE LA POKEBOLA");
                        }
                    } else if (temp.getEficiencia() == 1) {
                        int x = 1 + crit.nextInt(3);
                        if (x == 3) {
                            System.out.println("EL POKEMON A SIDO ATRAPDO");
                            ((Pokemon) pkmn.get(pospok)).setCatched(true);
                            ((Pokemon) pkmn.get(pospok)).setPkblCatched(temp);
                            pok.setCatched(true);
                        } else {
                            System.out.println("EL POKEMON SE HA ESCAPADO DE LA POKEBOLA");
                        }
                    }

                }

            }//fin capturar pokemon

            if (res_men == 6) {//modificar pokemon

                for (int i = 0; i < pkmn.size(); i++) {
                    Pokemon temp = (Pokemon) pkmn.get(i);
                    if (temp.isCatched()) {
                        System.out.println(i + ".- " + temp.toString());
                    }
                }

                System.out.println("Eliga el indice(x.- ) del pokemon a modificar: ");
                int pospok = jhin.nextInt();
                Pokemon temp = (Pokemon) pkmn.get(pospok);
                while (temp.isCatched() == false || pospok < 0 || pospok > pkmn.size() - 1) {
                    System.out.print("Ese pokemon o no existe o no ha sido atrapado, porfavor elegir uno que existe y ha sido atrapado: ");
                    pospok = jhin.nextInt();
                    while (pospok < 0 || pospok > pkmn.size() - 1) {
                        System.out.print("Esa posicion no existe porfavor eliga otra que si exista: ");
                        pospok = jhin.nextInt();
                    }
                    temp = (Pokemon) pkmn.get(pospok);
                }
                
                if (pkmn.get(pospok) instanceof Fire) {
                    System.out.println("*****MODIFICAR*****"
                            + "\n1. Nombre"
                            + "\n2. Numero de entrada"
                            + "\n3. Potencia de llamas"
                            + "\n4. Cancelar");
                    int menmod = jhin.nextInt();
                    
                    if (menmod == 1) {
                        System.out.println("Ingrese el nuevo nombre: ");
                        jhin.nextLine();
                        String nombre = jhin.nextLine();
                        ((Pokemon)pkmn.get(pospok)).setNombre(nombre);
                    }
                    
                    if (menmod == 2) {
                        System.out.println("Ingrese el nuevo numero de entrada: ");
                        int entrada = jhin.nextInt();
                        ((Pokemon)pkmn.get(pospok)).setEntrada(entrada);
                    }
                    
                    if (menmod == 3) {
                        System.out.println("Ingrese la nueva potencia de llamas: ");
                        int potencia = jhin.nextInt();
                        ((Fire)pkmn.get(pospok)).setPotencia(potencia);
                    }
                    
                } else if (pkmn.get(pospok) instanceof Water) {
                    System.out.println("*****MODIFICAR*****"
                            + "\n1. Nombre"
                            + "\n2. Numero de entrada"
                            + "\n3. Superviviencia fuera del agua"
                            + "\n4. Cancelar");
                    int menmod = jhin.nextInt();
                    
                    if (menmod == 1) {
                        System.out.println("Ingrese el nuevo nombre: ");
                        jhin.nextLine();
                        String nombre = jhin.nextLine();
                        ((Pokemon)pkmn.get(pospok)).setNombre(nombre);
                    }
                    
                    if (menmod == 2) {
                        System.out.println("Ingrese el nuevo numero de entrada: ");
                        int entrada = jhin.nextInt();
                        ((Pokemon)pkmn.get(pospok)).setEntrada(entrada);
                    }
                    
                    if (menmod == 3) {
                        System.out.println("Ingrese si el pokemon puede vivir fuera del agua[s/n]: ");
                        char resp = jhin.next().charAt(0);
                        boolean vive = false;
                        if (resp == 's' || resp == 'S') {
                            vive = true;
                        }
                        ((Water)pkmn.get(pospok)).setVive(vive);
                    }
                } else if (pkmn.get(pospok) instanceof Grass) {
                    System.out.println("*****MODIFICAR*****"
                            + "\n1. Nombre"
                            + "\n2. Numero de entrada"
                            + "\n3. Habitat"
                            + "\n4. Cancelar");
                    int menmod = jhin.nextInt();
                    
                    if (menmod == 1) {
                        System.out.println("Ingrese el nuevo nombre: ");
                        jhin.nextLine();
                        String nombre = jhin.nextLine();
                        ((Pokemon)pkmn.get(pospok)).setNombre(nombre);
                    }
                    
                    if (menmod == 2) {
                        System.out.println("Ingrese el nuevo numero de entrada: ");
                        int entrada = jhin.nextInt();
                        ((Pokemon)pkmn.get(pospok)).setEntrada(entrada);
                    }
                    
                    if (menmod == 3) {
                        System.out.println("Ingrese el nuevo habitat: ");
                        jhin.nextLine();
                        String habitat = jhin.nextLine();
                        ((Grass)pkmn.get(pospok)).setHabitat(habitat);
                    }
                }

            }//fin modificar pokemon

        }//fin while menu

    }//fin main

    public static void PrintA(ArrayList x) {

        for (int i = 0; i < x.size(); i++) {

            System.out.println(i + ".- " + x.get(i).toString());

        }

    }

    public static ArrayList Ordenamiento(ArrayList x) {
        ArrayList pkmn = new ArrayList();

        ArrayList<Fire> fire = new ArrayList();
        ArrayList<Water> water = new ArrayList();
        ArrayList<Grass> grass = new ArrayList();

        for (int i = 0; i < x.size(); i++) {//agrupacion de tipos

            if (x.get(i) instanceof Fire) {

                fire.add((Fire) x.get(i));

            }

            if (x.get(i) instanceof Water) {

                water.add((Water) x.get(i));

            }

            if (x.get(i) instanceof Grass) {

                grass.add((Grass) x.get(i));

            }

        }

        for (int i = 0; i < fire.size(); i++) {//anidacion de tipos agrupados
            pkmn.add(fire.get(i));
        }

        for (int i = 0; i < water.size(); i++) {
            pkmn.add(water.get(i));
        }

        for (int i = 0; i < grass.size(); i++) {
            pkmn.add(grass.get(i));
        }

        return pkmn;

    }

}//fin clase
