import java.util.Scanner;

public class EquipoVarios extends Equipo {
    private String usoEspecifico;

    public EquipoVarios() {
        super();
        this.usoEspecifico = "burbujas";
    }

    public EquipoVarios(String id, String nombre, double precio, boolean estado, String usoEspecifico) {
        super(id, nombre, precio, estado);
        this.usoEspecifico = usoEspecifico;
    }

    @Override
    public void leer() {
        Scanner sc = new Scanner(System.in);
        super.leer();
        this.usoEspecifico = sc.nextLine();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println(this.usoEspecifico);
    }

    @Override
    public double calcularCosto(int dias) {
        return((this.precioPorDia * dias) + 20);
    }

    @Override
    public String tipo() {
        return("VARIOS");
    }

    @Override
    public String aLinea() {
        return (super.aLinea() + ";" + this.usoEspecifico);
    }

    public String getUsoEspecifico() {
        return this.usoEspecifico;
    }

    public void setUsoEspecifico(String usoEspecifico) {
        this.usoEspecifico = usoEspecifico;
    }
}
