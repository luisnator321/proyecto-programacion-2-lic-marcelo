import java.util.Scanner;

public class EquipoIluminacion extends Equipo {
    private int cantidadLumens;
    private String tamanioLuz;

    public EquipoIluminacion() {
        super();
        this.cantidadLumens = 200;
        this.tamanioLuz = "grande";
    }

    public EquipoIluminacion(String id, String nombre, double precio, boolean estado, int cantidadLumens, String tamanioLuz) {
        super(id, nombre, precio, estado);
        this.cantidadLumens = cantidadLumens;
        this.tamanioLuz = tamanioLuz;
    }

    @Override
    public void leer() {
        Scanner sc = new Scanner(System.in);
        super.leer();
        this.cantidadLumens = sc.nextInt();
        this.tamanioLuz = sc.next();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(this.cantidadLumens);
        System.out.println(this.tamanioLuz);
    }

    @Override
    public double calcularCosto(int dias) {
        return ((this.precioPorDia * this.cantidadLumens) * dias);
    }

    @Override
    public String tipo() {
        return("ILUMINACION");
    }

    @Override
    public String aLinea() {
        return (super.aLinea() + ";" + this.cantidadLumens + ";" + this.tamanioLuz);
    }

    public int getCantidadLumens() {
        return this.cantidadLumens;
    }

    public String getTamanioLuz() {
        return this.tamanioLuz;
    }

    public void setCantidadLumens(int cantidadLumens) {
        this.cantidadLumens = cantidadLumens;
    }

    public void setTamanioLuz(String tamanioLuz) {
        this.tamanioLuz = tamanioLuz;
    }
}
