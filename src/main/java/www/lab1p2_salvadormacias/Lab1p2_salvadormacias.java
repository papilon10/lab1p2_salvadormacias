/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package www.lab1p2_salvadormacias;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Lab1p2_salvadormacias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static ArrayList usuarios = new ArrayList();

    public static void main(String[] args) {
        int opcion = 0;
        do {
            System.out.println("---sistema de registro de usuarios----");
            System.out.println("opciones\n1.registrar usuario\n2.listar todo\n3.listar por dominio\n4.salir");
            System.out.println("Ingrese opcion: ");
            opcion = lea.nextInt();
            switch (opcion) {
                case 1: {
                    System.out.println("Ingrese el nombre: ");
                    String nombre = str.nextLine();
                    System.out.println("Ingrese el apellido: ");
                    String apellido = str.nextLine();
                    System.out.println("Ingrese la fecha de nacimiento en formato (dd/mm/yyyy):");
                    String fecha = str.nextLine();
                    Date fecha2 = parse_f(fecha);
                    if (fecha != null) {
                       
                    } else {
                        System.out.println("la fecha fue ingresada en un formato incorrecto...");
                    }

                    System.out.println("Ingrese su correo electronico: ");
                    String correo = str.nextLine();

                    System.out.println("Ingrese la contrasena: ");
                    String contrasena = str.nextLine();
                    usuarios.add(new usuario(nombre, apellido, fecha2, correo, contrasena));

                }//fin case 1
                break;

                case 2: {
                    for (Object x : usuarios) {
                        System.out.println(usuarios);

                    }

                }//fin case 2
                break;
                case 3: {
                    for (Object x : usuarios) {

                        System.out.println(usuarios);

                    }

                }//fin case 3
                break;

                case 4: {

                }//fin case 4
                break;
                default:
                    System.out.println("opcion ingresada es invalida...");

            }//fin switch

        } while (opcion != 4);

    }//fin main

    private static Date parse_f(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        try {
            return sdf.parse(fecha);
        } catch (ParseException e) {
            // Si hay un error al parsear, se imprime la excepción (puedes manejarlo de otra manera si prefieres)
            e.printStackTrace();
            return null;
        }
    }

}//fin clase
