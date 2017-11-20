/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final;

import MatrizDispersa.ListaForma1;
import MatrizDispersa.NodoDoble;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Serializable;

/**
 *
 * @author Garces Usma
 */
public class MatrizAdya implements Serializable {
    
    private String[] indice;
    private int[][] matriz;
    private ListaForma1 Matriz1;

    public MatrizAdya() {
        
    }
    
    public String[] getIndice() {
        return indice;
    }
    
    public void setIndice(String[] indice) {
        this.indice = indice;
    }
    
    public int[][] getMatriz() {
        return matriz;
    }
    
    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }
    
    public ListaForma1 getMatriz1() {
        return Matriz1;
    }
    
    public void setMatriz1(ListaForma1 Matriz1) {
        this.Matriz1 = Matriz1;
    }
    
    public void agregarV(String agregar) {
        String retorno[] = new String[indice.length + 1];
        for (int i = 0; i < indice.length; i++) {
            retorno[i] = indice[i];
        }
        retorno[indice.length] = agregar;
        this.indice = retorno;
    }

    public void agregarM() {
        int retorno[][] = new int[this.matriz.length + 1][this.matriz.length + 1];
        for (int i = 0; i < this.matriz.length; i++) {
            for (int j = 0; j < this.matriz.length; j++) {
                retorno[i][j] = this.matriz[i][j];
            }
        }
        this.matriz = retorno;
    }
    
    public void insertarLlamda(String llamador, String receptor) {
        if (indice == null) {
            indice = new String[2];
            matriz = new int[2][2];
            indice[0] = llamador;
            indice[1] = receptor;
            this.Matriz1 = new ListaForma1(1, 1);
            this.Matriz1.indices();
        }
        
        boolean llamadorEsta = false;
        boolean receptorEsta = false;
        int fila = 0;
        int columna = 0;
        for (int i = 0; i < this.indice.length; i++) {
            if (this.indice[i].equals(llamador)) {
                llamadorEsta = true;
            }
            if (this.indice[i].equals(receptor)) {
                receptorEsta = true;
            }
        }
        if (!llamadorEsta) {
            agregarV(llamador);
            agregarM();
            this.Matriz1.incrementar();
        }
        if (!receptorEsta) {
            agregarV(receptor);
            agregarM();
            this.Matriz1.incrementar();
        }
        for (int i = 0; i < this.indice.length; i++) {
            if (this.indice[i].equals(llamador)) {
                fila = i;
            }
            if (this.indice[i].equals(receptor)) {
                columna = i;
            }
        }
        this.matriz[fila][columna] = 1;
        NodoDoble p = new NodoDoble(fila, columna, 1);
        this.Matriz1.conectarColumnas(p);
        this.Matriz1.conectarFilas(p);
    }
    
    public String leerTXT(String ruta) {
        String texto = "";
        try {
            BufferedReader bf = new BufferedReader(new FileReader(ruta));
            String llamador, receptor;
            String bfRead;
            while ((bfRead = bf.readLine()) != null) {
                if (!bfRead.equals("")) {
                    llamador = bfRead.substring(0, 12);
                    receptor = bfRead.substring(13, 25);
                    insertarLlamda(llamador, receptor);
                    
                }                
            }
            
        } catch (Exception e) {
            System.err.println("no se encontro el archivo");
        }
        
        return texto;
    }
    
    @Override
    public String toString() {
        String retorno = "";
        for (int i = 0; i < indice.length; i++) {
            retorno = retorno + '\n' + indice[i];
        }
        return retorno;
    }
    public int cantidadLLamadas(String numero){
     int cont=0,i=0;
    
     while(!numero.equals(this.indice[i])){
     i++;
     }
     cont=this.Matriz1.cantLlamadas(i);
     return cont;
     }
    
}
