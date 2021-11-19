
import java.awt.Color;
import java.util.Date;

public class Usuario {
    
    private String nombre, apellido, usuario, contraseña;
    private Date nacimiento;
    private int edad;
    private Color color;
    private Pokedex pk1, pk2, pk3;

    public Usuario() {
    }
    
    public Usuario(String nombre, String apellido, String usuario, String contraseña, Date nacimiento, Color color) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nacimiento = nacimiento;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Pokedex getPk1() {
        return pk1;
    }

    public void setPk1(Pokedex pk1) {
        this.pk1 = pk1;
    }

    public Pokedex getPk2() {
        return pk2;
    }

    public void setPk2(Pokedex pk2) {
        this.pk2 = pk2;
    }

    public Pokedex getPk3() {
        return pk3;
    }

    public void setPk3(Pokedex pk3) {
        this.pk3 = pk3;
    }

    @Override
    public String toString() {
        return  nombre + " " + apellido;
    }
    
    
}
