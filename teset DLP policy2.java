package com.ejemplo.app;

import java.time.LocalDateTime;
import java.util.UUID;

public class ClienteService {

    private static final String VERSION = "1.0.0";

    public static void main(String[] args) {
        Cliente cliente = new Cliente(
                UUID.randomUUID().toString(),
                "Juan Pérez",
                "juan.perez@empresa.com",
                "+34 600 123 456"
        );

        System.out.println("Aplicación iniciada");
        System.out.println("Versión: " + VERSION);
        System.out.println("Fecha: " + LocalDateTime.now());

        procesarCliente(cliente);
    }

    public static void procesarCliente(Cliente cliente) {
        System.out.println("Procesando cliente:");
        System.out.println(cliente);

        if (cliente.getEmail().contains("@empresa.com")) {
            System.out.println("Cliente corporativo detectado");
        }
    }

    static class Cliente {
        private String id;
        private String nombre;
        private String email;
        private String telefono;

        public Cliente(String id, String nombre, String email, String telefono) {
            this.id = id;
            this.nombre = nombre;
            this.email = email;
            this.telefono = telefono;
        }

        public String getId() {
            return id;
        }

        public String getNombre() {
            return nombre;
        }

        public String getEmail() {
            return email;
        }

        public String getTelefono() {
            return telefono;
        }

        @Override
        public String toString() {
            return "Cliente{" +
                    "id='" + id + '\'' +
                    ", nombre='" + nombre + '\'' +
                    ", email='" + email + '\'' +
                    ", telefono='" + telefono + '\'' +
                    '}';
        }
    }
}