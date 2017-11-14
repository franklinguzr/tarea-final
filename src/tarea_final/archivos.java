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
public class archivos {

    public archivos() {
    }
    
    
   public String leerTXT(String ruta){
       String texto="";
   try{
   BufferedReader bf= new BufferedReader(new FileReader(ruta));

   String bfRead;
   
   while(( bfRead=bf.readLine())!=null){
    if(!bfRead.equals("")){
        
        System.out.println(bfRead.substring(0, 12));
        System.out.println(bfRead.substring(13, 25));
        
        System.out.println(bfRead);
  } 
   }

   
   }catch(Exception e){
       System.err.println("no se encontro el archivo");}

   return texto;
   }
   
   
   
   
}
