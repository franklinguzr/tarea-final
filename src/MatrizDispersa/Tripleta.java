/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizDispersa;

/**
 *
 * @author Garces Usma
 */
public class Tripleta {
    private int fila;
    private int Columna;
    private int valor;

    public Tripleta(int fila, int Columna, int valor) {
        this.fila = fila;
        this.Columna = Columna;
        this.valor = valor;
    }

    public Tripleta() {
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return Columna;
    }

    public void setColumna(int Columna) {
        this.Columna = Columna;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    
}
