public class main{
public static void main(String[] args) {
        persona miPersona = new persona("luis");
        miPersona.setEdad(20);
	miPersona.setTelefono(555555);
        System.out.println("El nombre de la persona es:" + miPersona.getNombre()+ " su edd y numero: " + miPersona.getEdad() + miPersona.getTelefono());
}
}

