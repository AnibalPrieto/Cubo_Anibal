/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aniba
 */
public class cubo {
    private int alto;
    private int ancho;
    private int profundo;

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    public cubo(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    @Override
    public String toString() {
        return "cubo{" + "alto=" + alto + ", ancho=" + ancho + ", profundo=" + profundo + '}';
    }
    
    
    
    
    public void volumen(){
        int vol;
        vol = alto*ancho*profundo;
        System.out.println("El volumen total es:"+vol);
        
    }
    
}
