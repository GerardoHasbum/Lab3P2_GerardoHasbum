package lap3p2_gerardohasbum;
public class Pokebola {
    
    String color;
    String serie;
    int eficiencia;

    public Pokebola() {
    }

    public Pokebola(String color, String serie, int eficiencia) {
        this.color = color;
        this.serie = serie;
        this.eficiencia = eficiencia;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(int eficiencia) {
        this.eficiencia = eficiencia;
    }

    @Override
    public String toString() {
        return "   Pokebola: " + serie + "\n   Color: " + color + "\n   Eficiencia: " + eficiencia;
    }
    
    
    
}
