
import java.util.ArrayList;

public class PokeGrupo {
    
    private String nombre, tipo;
    private ArrayList <Usuario> miembros = new ArrayList();
    private Usuario lider;

    public PokeGrupo(String nombre, Usuario lider) {
        this.nombre = nombre;
        this.lider = lider;
        miembros.add(lider);
        this.setTipo();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo() {
        if(miembros.size()<=3){
            this.tipo = "novato";
        }else if(miembros.size()<=7){
            this.tipo = "veterano";
        }else{
            this.tipo = "legendario";
        }
    }

    public ArrayList<Usuario> getMiembros() {
        return miembros;
    }

    public void setMiembros(ArrayList<Usuario> miembros) {
        this.miembros = miembros;
    }

    public Usuario getLider() {
        return lider;
    }

    public void setLider(Usuario lider) {
        this.lider = lider;
    }
    
    
}
