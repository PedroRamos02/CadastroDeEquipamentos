package Equipamentos;

public class Escavadeira extends Equipamento {

    private String combustivel;
    private double carga;
    public Escavadeira (int id, String nome, double custoDia,String combustivel, double carga){
        super(id, nome, custoDia);
        this.combustivel = combustivel;
        this.carga = carga;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public double getCarga() {
        return carga;
    }

    public String toString() {
        return "Escavadeira\n" + super.toString()+ String.format("""
                Combustivel: %s
                Carga: %.2f
                ==================================""",combustivel, carga);
    }
}
