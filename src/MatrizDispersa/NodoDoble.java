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
public class NodoDoble {
    private NodoDoble ligaIzq;
    private NodoDoble ligaDer;
    private Tripleta tri;

    public NodoDoble() {
    }

    public NodoDoble(int fila, int columna, int valor) {
        this.tri= new Tripleta(fila,columna,valor);
       this.ligaDer=this.ligaIzq=null;
    }

    public NodoDoble getLigaIzq() {
        return ligaIzq;
    }

    public void setLigaIzq(NodoDoble ligaIzq) {
        this.ligaIzq = ligaIzq;
    }

    public NodoDoble getLigaDer() {
        return ligaDer;
    }

    public void setLigaDer(NodoDoble ligaDer) {
        this.ligaDer = ligaDer;
    }

    public Tripleta getTri() {
        return tri;
    }

    public void setTri(Tripleta tri) {
        this.tri = tri;
    }
    
    
    
    
}
