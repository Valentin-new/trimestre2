package Contacto_Agenda;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();

        Contacto contacto1 = new Contacto("Juan", "123456789");
        Contacto contacto2 = new Contacto("María", "987654321");
        Contacto contacto3 = new Contacto("Carlos", "456123789");

        agenda.aniadirContacto(contacto1);
        agenda.aniadirContacto(contacto2);
        agenda.aniadirContacto(contacto3);

        agenda.listarContactos();

        System.out.println("¿Existe el contacto Juan? " + agenda.existeContacto(contacto1));

        agenda.buscaContacto("María");

        Contacto contacto4 = new Contacto("Juan", "111111111");
        agenda.aniadirContacto(contacto4);

        System.out.println("¿Existe el contacto Juan? " + agenda.existeContacto(contacto1));

        agenda.eliminarContacto(contacto2);
        agenda.listarContactos();

        System.out.println("¿Agenda llena? " + agenda.agendaLlena());
        System.out.println("Huecos libres: " + agenda.huecosLibres());
    }
}
