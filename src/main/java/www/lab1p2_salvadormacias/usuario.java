/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.lab1p2_salvadormacias;

import java.util.Date;

/**
 *
 * @author Apple
 */
public class usuario {

    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    /**
     *
     * @author Apple
     */
    

        String nombre;
        String apellido;
        Date fecha_nacimiento;
        String correo;
        String contrasena;

        public usuario() {
        }

        public usuario(String nombre, String apellido, Date fecha_nacimiento, String correo, String contrasena) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.fecha_nacimiento = fecha_nacimiento;
            this.correo = correo;
            this.contrasena = contrasena;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public Date getFecha_nacimiento() {
            return fecha_nacimiento;
        }

        public void setFecha_nacimiento(Date fecha_nacimiento) {
            this.fecha_nacimiento = fecha_nacimiento;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }

        @Override
        public String toString() {
            return "usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", fecha_nacimiento=" + fecha_nacimiento + ", correo=" + correo + ", contrasena=" + contrasena + '}';
        }

    }


