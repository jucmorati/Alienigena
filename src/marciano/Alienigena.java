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
public class Alienigena {
 String color;
 int numvidas;
 int numojos;

    public Alienigena(String color, int numvidas, int numojos) {
        this.color = color;
        this.numvidas = numvidas;
        this.numojos = numojos;
    }

    @Override
    public String toString() {
        return "Alienigena{" + "color=" + color + ", numvidas=" + numvidas + ", numojos=" + numojos + '}';
    }
 
}
