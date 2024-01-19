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
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
                    Calendar hoy = Calendar.getInstance();

                    System.out.println("Ingrese su correo electronico: ");
                    String correo = str.nextLine();
                    String correo_Regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
                    Pattern patron_correo = Pattern.compile(correo_Regex);
                    Matcher emailMatcher = patron_correo.matcher(correo);
                    String correo2 = correo;

                    if (emailMatcher.matches()) {
                        System.out.println("El formato ingresado para el correo es valido ");

                    } else {
                        System.out.println("El formato ingresado para el correo es invalido ");
                    }

                    System.out.println("Ingrese la contrasena: ");
                    String contrasena = str.nextLine();
                    String contra_Regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@!?<>%$])[A-Za-z\\d@!?<>%$]{8,}$";
                    Pattern patron_contra = Pattern.compile(contra_Regex);
                    Matcher passwordMatcher = patron_contra.matcher(contrasena);

                    if (passwordMatcher.matches()) {
                        String contra =contrasena;
                        
                    } else {
                        System.out.println("la contrasena ingresada es invalida");
                    }

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
                    System.out.println("se abandonara el programa...");

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
