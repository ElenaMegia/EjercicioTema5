package com.example.ejerciciotema5.ejercicio10;

import com.example.ejerciciotema5.Ejercicio9;

import java.util.HashMap;
import java.util.Map;
public class Ejercicio10 {



        private Map<String, Empleado> tablaNombre;
        private Map<Integer, Empleado> tablaNumeroEmpleado;
        private Map<Integer, Empleado> tablaNumSegSocial;

        public Ejercicio10() {
            tablaNombre = new HashMap<>();
            tablaNumeroEmpleado = new HashMap<>();
            tablaNumSegSocial = new HashMap<>();
        }

        public void agregarEmpleado(Empleado empleado) {
            tablaNombre.put(empleado.getNombre(), empleado);
            tablaNumeroEmpleado.put(empleado.getNumEmpleado(), empleado);
            tablaNumSegSocial.put(empleado.getNumSeguridadSocial(), empleado);
        }

        public Empleado buscarPorNombre(String nombre) {
            return tablaNombre.get(nombre);
        }

        public Empleado buscarPorNumeroEmpleado(int numeroEmpleado) {
            return tablaNumeroEmpleado.get(numeroEmpleado);
        }

        public Empleado buscarPorNumSegSocial(int numSegSocial) {
            return tablaNumSegSocial.get(numSegSocial);
        }




        public static void main(String[] args) {
            Ejercicio10 tabla = new Ejercicio10();

            Empleado empleado1 = new Empleado("Juan", 1001, 123456789);
            Empleado empleado2 = new Empleado("María", 1002, 987654321);

            tabla.agregarEmpleado(empleado1);
            tabla.agregarEmpleado(empleado2);

            Empleado resultado = tabla.buscarPorNumSegSocial(987654321);

            System.out.println("Buscar empleado por número de seguridad social: ");
            if (resultado != null) {
                System.out.println("Empleado encontrado: " + resultado.getNombre());
            } else {
                System.out.println("Empleado no encontrado");
            }

            System.out.println("Buscar empleado por nombre");
            Empleado resultado2 = tabla.buscarPorNombre("Juan");
            System.out.println("¿Existe el empleado llamado Juan? " + (resultado2 != null));
            System.out.println("Buscar empleado por número de empleado");
            Empleado resultado3 = tabla.buscarPorNumeroEmpleado(1001);
            System.out.println("¿Existe el empleado con número de empleado 1001? " + (resultado3 != null));

        }







}
