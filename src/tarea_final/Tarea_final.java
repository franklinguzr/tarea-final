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
public class Tarea_final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        573509898764|573678377362|4

        573678377362|573678322362|2

        573678322362|573503434311|1

        573503434311|573558371234|10
         */
        MatrizAdya mat = new MatrizAdya();
        mat.insertarLlamda("1", "7");
        mat.insertarLlamda("1", "2");
        mat.insertarLlamda("1", "3");
        mat.insertarLlamda("2", "3");
        mat.insertarLlamda("3", "4");
        mat.insertarLlamda("3", "6");
        mat.insertarLlamda("3", "5");
        mat.insertarLlamda("4", "5");
        mat.insertarLlamda("5", "6");
        mat.insertarLlamda("8", "6");
        mat.insertarLlamda("7", "9");
        mat.insertarLlamda("7", "8");
        mat.insertarLlamda("9", "8");
        mat.insertarLlamda("9", "6");
        mat.getMatriz1().mostrar();
        MatrizCostos costo = new MatrizCostos();
        costo.crearCostosLL(mat.getMatriz1(), mat.getIndice());
        costo.crearCostos(mat.getMatriz(), mat.getIndice());
        System.out.println("---");
        costo.getPeso1().mostrar();

    }

}
