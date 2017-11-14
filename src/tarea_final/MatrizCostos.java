/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final;

/**
 *
 * @author Garces Usma
 */
public class MatrizCostos {
     private String []indice;
    private int [][]peso;

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
 
    public void crearCostos(int adya[][], String ind[]){
        this.indice=ind;
       int a= adya.length;
       int matrizPeso[][];
       matrizPeso=adya;
   
    for(int k=0;k<a;k++){
  for(int i=0;i<a;i++){
 for(int j=0;j<a;j++){
   if ((matrizPeso[i][k] == 1) && (matrizPeso[k][j] == 1) && (i != j)){
     matrizPeso[i][j] = 1;
     }
      }
     }
     }
    
    this.peso=matrizPeso;
    }
    
    public void caminosCortos(int costos[][]){
        int n=costos.length;
        int aux;
        int menoresCostos[][] = costos;
        for(int k=0;k<n;k++){
        for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
        aux = menoresCostos[i][k] + menoresCostos[k][j];
        if (aux < menoresCostos[i][j]){
        menoresCostos[i][j] = aux;
        }
        }
        }
        }
  costos=menoresCostos;
    }
   

    
    
    
}
