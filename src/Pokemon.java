public class Pokemon {
    
    private String nombre,velocidad;
    private int daño, vida;

    public Pokemon() {
    }

    public Pokemon(String nombre, String velocidad, int daño, int vida) {
        this.nombre = nombre;
        this.velocidad = velocidad;
        this.daño = daño;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
