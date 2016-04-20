/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marciano;

/**
 *
 * @author Camilo-luisa-felipe-luis
 */
public class Marte extends Alienigena {
    private String planeta;

    public Marte(String planeta, String color, int numvidas, int numojos) {
        super(color, numvidas, numojos);
        this.planeta = planeta;
    }

    public String getPlaneta() {
        return planeta;
    }

    public void setPlaneta(String planeta) {
        this.planeta = planeta;
    }

    @Override
    public String toString() {
        return "Marciano{" + "planeta=" + planeta + ", color=" + color + ", numvidas=" + numvidas + ", numojos=" + numojos + '}';
    }
    
}
