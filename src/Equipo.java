import java.util.Scanner;

public abstract class Equipo {
    protected String idEquipo;
    protected String nombre;
    protected double precioPorDia;
    protected boolean estado;

    public Equipo() {
        this.idEquipo = "son01";
        this.nombre = "sonido yamaha";
        this.precioPorDia = 89;
        this.estado = true;
    }
    public Equipo(String idEquipo, String nombre, double precioPorDia, boolean estado) {
        this.idEquipo = idEquipo;
        this.nombre = nombre;
        this.precioPorDia = precioPorDia;
        this.estado = estado;
    }
    public void leer() {
        Scanner lee = new Scanner(System.in);
        this.idEquipo = lee.nextLine();
        this.nombre = lee.nextLine();
        this.precioPorDia = lee.nextDouble();
        this.estado = lee.nextBoolean();
    }

    public void mostrar() {
        System.out.println(this.idEquipo);
        System.out.println(this.nombre);
        System.out.println(this.precioPorDia);
        System.out.println(this.estado);
    }

    public double calcularCosto(int dias) {
        return (this.precioPorDia * dias);
    }

    public String tipo() {
        return("GENERAL");
    }

    public String aLinea() {
        return(this.idEquipo + ";" + this.nombre + ";" + this.precioPorDia + ";" + this.estado);
    }

    public String getIdEquipo() {
        return this.idEquipo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecioPorDia() {
        return this.precioPorDia;
    }

    public boolean getEstado() {
        return this.estado;
    }

    public void setIdEquipo(String idEquipo) {
        this.idEquipo = idEquipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
