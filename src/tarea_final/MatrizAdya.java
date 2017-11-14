/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_final;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author Garces Usma
 */
public class MatrizAdya {
    
    private String []indice;
    private int [][]matriz;

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

    public void agregarV(String agregar){
    String retorno[]=new String[indice.length+1];
    for(int i=0;i<indice.length;i++){
    retorno[i]=indice[i];
    }
    retorno[indice.length]=agregar;
    this.indice=retorno;
    }
    public void agregarM(){
    int retorno[][]=new int[this.matriz.length+1][this.matriz.length+1];
        for(int i=0;i<this.matriz.length;i++){
        for(int j=0;j<this.matriz.length;j++){
            retorno[i][j]=this.matriz[i][j];
        }
        }
        this.matriz=retorno;
    }
    
    
    
    public void insertarLlamda(String llamador,String receptor){
        if(indice==null){
        indice= new String[2];
        matriz= new int[2][2];
        indice[0]=llamador;
        indice[1]=receptor;
        }
        
        boolean llamadorEsta=false;
        boolean receptorEsta=false;
        int fila=0;
        int columna=0;
        for(int i=0;i<this.indice.length;i++){
         if(this.indice[i].equals(llamador)){
             llamadorEsta=true;
         }
         if(this.indice[i].equals(receptor)){
             receptorEsta=true;
         }
        }
    if(!llamadorEsta){
    agregarV(llamador);
    agregarM();
    
    }
    if(!receptorEsta){
        agregarV(receptor);
        agregarM();
    }
   //necesito la fila llamador
   for(int i=0;i<this.indice.length;i++){
   if(this.indice[i].equals(llamador)){
       fila=i;
   }
   if(this.indice[i].equals(receptor)){
       columna=i;
   }
   }
     this.matriz[fila][columna]=1;
    }
    
    
   public String leerTXT(String ruta){
       String texto="";
   try{
   BufferedReader bf= new BufferedReader(new FileReader(ruta));
   String llamador, receptor;
   String bfRead;
   while(( bfRead=bf.readLine())!=null){
    if(!bfRead.equals("")){
        llamador=bfRead.substring(0, 12);
        receptor=bfRead.substring(13, 25);
        insertarLlamda(llamador,receptor);
       
   } 
   }

   
   }catch(Exception e){
       System.err.println("no se encontro el archivo");}

   return texto;
   }

    @Override
    public String toString() {
        String retorno="";
        for(int i=0;i<indice.length;i++){
        retorno=retorno+'\n'+indice[i];
        }
        
        
        return retorno;
    }
    
   
   
   
}
