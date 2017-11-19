/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final;

import MatrizDispersa.ListaForma1;
import MatrizDispersa.NodoDoble;
import MatrizDispersa.Tripleta;

/**
 *
 * @author Garces Usma
 */
public class MatrizCostos {

    private String[] indice;
    private int[][] peso;
    private ListaForma1 peso1;

    public MatrizCostos() {
    }

    public String[] getIndice() {
        return indice;
    }

    public void setIndice(String[] indice) {
        this.indice = indice;
    }

    public int[][] getMatriz() {
        return peso;
    }

    public void setMatriz(int[][] matriz) {
        this.peso = matriz;
    }

    public int[][] getPeso() {
        return peso;
    }

    public void setPeso(int[][] peso) {
        this.peso = peso;
    }

    public ListaForma1 getPeso1() {
        return peso1;
    }

    public void setPeso1(ListaForma1 peso1) {
        this.peso1 = peso1;
    }

    public void crearCostosLL(ListaForma1 adya, String ind[]) {
        this.indice = ind;
        ListaForma1 matrizPeso;
        int a = ind.length;
        matrizPeso = adya;

        for (int k = 0; k < a; k++) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if ((matrizPeso.retornaDato(i, k) != 0)
                            && (matrizPeso.retornaDato(k, j) != 0)
                            && (i != j)) {

                        if ((matrizPeso.retornaDato(i, j) > matrizPeso.retornaDato(i, k) + 1) || (matrizPeso.retornaDato(i, j) == 0)) {
                         
                           if(matrizPeso.retornaNodo(i, j)!=null){
                            NodoDoble x;
                            x=matrizPeso.retornaNodo(i, j);
                            Tripleta t=new Tripleta(i,j,(matrizPeso.retornaDato(i, k) + 1));
                            x.setTri(t);
                           }else{
                                NodoDoble p = new NodoDoble(i, j, (matrizPeso.retornaDato(i, k) + 1));
                                matrizPeso.conectarColumnas(p);
                                matrizPeso.conectarFilas(p);
                           }
                            
                        }
                    }
                }
            }
        }
        this.peso1 = matrizPeso;
    }

    public void crearCostos(int adya[][], String ind[]) {
        this.indice = ind;
        int a = adya.length;
        int matrizPeso[][];
        matrizPeso = adya;

        for (int k = 0; k < a; k++) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if ((matrizPeso[i][k] != 0) && (matrizPeso[k][j] != 0) && (i != j)) {

                        if ((matrizPeso[i][j] > matrizPeso[i][k] + 1) || (matrizPeso[i][j] == 0)) {
                            matrizPeso[i][j] = matrizPeso[i][k] + 1;
                        }
                    }
                }
            }
        }
        this.peso = matrizPeso;
    }

}
