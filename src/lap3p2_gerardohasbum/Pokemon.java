package lap3p2_gerardohasbum;
public class Pokemon {
    
    String nombre;
    int entrada;
    String naturaleza;
    boolean catched;
    Pokebola pkblCatched;

    public Pokemon() {
    }

    public Pokemon(String nombre, int entrada, String naturaleza, boolean catched, Pokebola pkblCatched) {
        this.nombre = nombre;
        this.entrada = entrada;
        this.naturaleza = naturaleza;
        this.catched = catched;
        this.pkblCatched = pkblCatched;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEntrada() {
        return entrada;
    }

    public void setEntrada(int entrada) {
        this.entrada = entrada;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isCatched() {
        return catched;
    }

    public void setCatched(boolean catched) {
        this.catched = catched;
    }

    public Pokebola getPkblCatched() {
        return pkblCatched;
    }

    public void setPkblCatched(Pokebola pkblCatched) {
        this.pkblCatched = pkblCatched;
    }

    @Override
    public String toString() {
        return entrada+". "+nombre+"\n"+"Naturaleza: " + naturaleza + "\nAtrapado: " + catched + "\nPokebola con la que se atrapo:\n" + pkblCatched;
    }
    
}
