package lap3p2_gerardohasbum;

public class Fire extends Pokemon {

    protected int potencia;

    public Fire() {
    }

    public Fire(int potencia, String nombre, int entrada, String naturaleza) {
        super(nombre, entrada, naturaleza);
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo Fuego\nPotencia de llamas: " + potencia;
    }

}
