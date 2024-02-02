package lap3p2_gerardohasbum;
public class Grass extends Pokemon{
    
    String habitat;
    int dominio;

    public Grass() {
    }

    public Grass(String habitat, int dominio, String nombre, int entrada, String naturaleza) {
        super(nombre, entrada, naturaleza);
        this.habitat = habitat;
        this.dominio = dominio;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTipo Planta\nHabitat: "+habitat+"\nDominio sobre las plantas: "+dominio;
    }  
    
}
