import java.util.Scanner;

public class EquipoSonido extends Equipo {
    private int potenciaWatts;
    private String calidadSonido;

    public EquipoSonido() {
        super();
        this.potenciaWatts = 200;
        this.calidadSonido = "buena";
    }

    public EquipoSonido(String id, String nombre, double precio, boolean estado, int potenciaWatts, String calidadSonido) {
        super(id, nombre, precio, estado);
        this.potenciaWatts = potenciaWatts;
        this.calidadSonido = calidadSonido;
    }

    public void leer() {
        Scanner sc = new Scanner(System.in);
        super.leer();
        this.potenciaWatts = sc.nextInt();
        this.calidadSonido = sc.next();
    }

    public void mostrar() {
        super.mostrar();
        System.out.println(this.potenciaWatts);
        System.out.println(this.calidadSonido);
    }

    public double calcularCosto(int dias) {
        return ((0.5 * this.potenciaWatts) + (this.precioPorDia * dias));
    }

    public String tipo() {
        return "SONIDO";
    }

    public String aLinea() {
        return (super.aLinea() + ";" + this.potenciaWatts + ";" + this.calidadSonido);
    }

    public int getPotenciaWatts() {
        return this.potenciaWatts;
    }

    public String getCalidadSonido() {
        return this.calidadSonido;
    }

    public void setPotenciaWatts(int potenciaWatts) {
        this.potenciaWatts = potenciaWatts;
    }

    public void setCalidadSonido(String calidadSonido) {
        this.calidadSonido = calidadSonido;
    }
}
