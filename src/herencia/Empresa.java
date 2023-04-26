package herencia;

public class Empresa {
    public static void main(String[] args) {
        //crear una instancia de tipo Empleado
        Empleado empleado = new Empleado();

        empleado.setNombre("Flor");
        empleado.setPrimerApellido("Tiscornia");
        empleado.setSegundoApellido("Blanco");
        empleado.setDni("Y8765801D");
        empleado.setEdad(38);
        empleado.setAntiguedad(20);
        empleado.setPuesto("Jefe");
        empleado.setSalario(1800.0);

        System.out.println(empleado);

        empleado.actualizarSalario(150.0);

        System.out.println(empleado);
    }
}
