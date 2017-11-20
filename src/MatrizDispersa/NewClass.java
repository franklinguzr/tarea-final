/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizDispersa;

import java.util.Scanner;

/**
 *
 * @author Garces Usma
 */
public class NewClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean aux = true;
        int m = 3, n = 3;
        int f, c, v;

        ListaForma1 a = new ListaForma1(m, n);
        a.indices();
        Tripleta t;
        NodoDoble x;

        while (aux) {
            System.out.println("fila");
            f = sc.nextInt();
            System.out.println("columna");
            c = sc.nextInt();
            System.out.println("valor");
            v = sc.nextInt();

            x = new NodoDoble(f, c, v);
            a.conectarFilas(x);
            a.conectarColumnas(x);

            System.out.println(" continuar");
            aux = sc.nextBoolean();
        }

        a.mostrar();
        System.out.println(a.cantLlamadas(3));

    }
}
