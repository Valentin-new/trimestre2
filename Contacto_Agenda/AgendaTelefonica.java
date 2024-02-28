package Contacto_Agenda;

import java.util.ArrayList;

class AgendaTelefonica {
    private ArrayList<Contacto> contactos;
    private int capacidad;

    public AgendaTelefonica() {
        this(10);
    }

    public AgendaTelefonica(int capacidad) {
        this.capacidad = capacidad;
        contactos = new ArrayList<>(capacidad);
    }

    public void aniadirContacto(Contacto c) {
        if (!agendaLlena() && !contactos.contains(c)) {
            contactos.add(c);
            System.out.println("Contacto añadido correctamente.");
        } else if (agendaLlena()) {
            System.out.println("La agenda está llena. No se puede añadir más contactos.");
        } else {
            System.out.println("El contacto ya existe en la agenda.");
        }
    }

    public boolean existeContacto(Contacto c) {
        return contactos.contains(c);
    }

    public void listarContactos() {
        for (Contacto c : contactos) {
            System.out.println("Nombre: " + c.getNombre() + ", Teléfono: " + c.getTelefono());
        }
    }

    public void buscaContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nombre: " + c.getNombre() + ", Teléfono: " + c.getTelefono());
                return;
            }
        }
        System.out.println("Contacto no encontrado.");
    }

    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("Contacto eliminado correctamente.");
        } else {
            System.out.println("El contacto no existe en la agenda.");
        }
    }

    public boolean agendaLlena() {
        return contactos.size() >= capacidad;
    }

    public int huecosLibres() {
        return capacidad - contactos.size();
    }
}
