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
public class Tripleta<E> {

    private int fila;
    private int Columna;
    private E valor;

    public Tripleta(int fila, int Columna, E valor) {
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

    public E getValor() {
        return valor;
    }

    public void setValor(E valor) {
        this.valor = valor;
    }

}
