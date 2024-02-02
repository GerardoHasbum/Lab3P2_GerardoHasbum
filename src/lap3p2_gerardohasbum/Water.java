package lap3p2_gerardohasbum;

public class Water extends Pokemon {

    protected boolean vive;
    protected int velocidad;

    public Water() {
    }

    public Water(boolean vive, int velocidad, String nombre, int entrada, String naturaleza) {
        super(nombre, entrada, naturaleza);
        this.vive = vive;
        this.velocidad = velocidad;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo Agua\nSobrevive afuera del agua: " + vive + "\nVelocidad al nadar: " + velocidad;
    }

}
