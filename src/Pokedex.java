public class Pokedex {
    
    private Pokemon pk1, pk2, pk3;
    private int daño;

    public Pokedex() {
    }

    public Pokedex(Pokemon pk1, Pokemon pk2, Pokemon pk3) {
        this.pk1 = pk1;
        this.pk2 = pk2;
        this.pk3 = pk3;
        this.daño = (pk1.getDaño() + pk2.getDaño() + pk3.getDaño())/3;
    }

    public Pokemon getPk1() {
        return pk1;
    }

    public void setPk1(Pokemon pk1) {
        this.pk1 = pk1;
    }

    public Pokemon getPk2() {
        return pk2;
    }

    public void setPk2(Pokemon pk2) {
        this.pk2 = pk2;
    }

    public Pokemon getPk3() {
        return pk3;
    }

    public void setPk3(Pokemon pk3) {
        this.pk3 = pk3;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }
    
}
