/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MatrizDispersa;

import java.io.Serializable;
import java.util.LinkedList;

/**
 *
 * @author Garces Usma
 */
public class ListaForma1<E> implements Serializable {

    private NodoDoble cab;

    public ListaForma1(int fila, int columna) {
        cab = new NodoDoble(fila, columna, null);
        this.cab.getTri().setValor(cab);
    }

    public ListaForma1() {
    }

    public NodoDoble primerNodo() {
        Tripleta tp = cab.getTri();
        NodoDoble p = (NodoDoble) tp.getValor();
        return p;
    }

    public boolean esVacia() {
        NodoDoble p = primerNodo();

        return (p == cab);
    }

    public boolean finRecorrido(NodoDoble p) {
        return (p == cab);
    }

    public void indices() {
            int filas = this.cab.getTri().getFila();
        NodoDoble x, ult;
        x = this.cab;
        ult = x;
        for (int i = 0; i <= filas; i++) {
            ult = new NodoDoble(i, i, this.cab);
            x.getTri().setValor(ult);
            x.setLigaDer(x);
            x.setLigaIzq(x);
            x = ult;
            ult.setLigaDer(ult);
            ult.setLigaIzq(ult);
        }

    }

    public void conectarFilas(NodoDoble x) {
        NodoDoble p, q, ant;
        Tripleta tp, tq, tx;
        tx = (Tripleta) x.getTri();
        p = this.cab;
        for (int i = 0; i <= tx.getFila(); i++) {
            tp = (Tripleta) p.getTri();
            p = (NodoDoble) tp.getValor();
        }
        ant = p;
        q = p.getLigaDer();
        tq = (Tripleta) q.getTri();
        while ((q != p) && (tq.getColumna()) < tx.getColumna()) {
            ant = q;
            q = q.getLigaDer();
            tq = (Tripleta) q.getTri();
        }
        ant.setLigaDer(x);
        x.setLigaDer(q);
    }

    public void conectarColumnas(NodoDoble x) {
        NodoDoble p, q, ant;
        Tripleta tp, tq, tx;
        tx = (Tripleta) x.getTri();
        p = this.cab;
        for (int i = 0; i <= tx.getColumna(); i++) {
            tp = (Tripleta) p.getTri();
            p = (NodoDoble) tp.getValor();
        }
        ant = p;
        q = p.getLigaIzq();
        tq = (Tripleta) q.getTri();
        while ((q != p) && (tq.getFila()) < tx.getFila()) {
            ant = q;
            q = q.getLigaIzq();
            tq = (Tripleta) q.getTri();
        }
        ant.setLigaIzq(x);
        x.setLigaIzq(q);
    }

    public void incrementar() {
        Tripleta t;
        t = this.cab.getTri();
        t.setColumna(t.getColumna() + 1);
        t.setFila(t.getFila() + 1);
        this.cab.setTri(t);
        NodoDoble p = primerNodo();
        NodoDoble x = new NodoDoble(t.getFila(), t.getColumna(), this.cab);
        x.setLigaDer(x);
        x.setLigaIzq(x);
        while (!finRecorrido((NodoDoble) p.getTri().getValor())) {
            p = (NodoDoble) p.getTri().getValor();
        }
        p.getTri().setValor(x);
    }

    public void mostrar() {
        int qf, qc, qv;
        NodoDoble p, q;
        Tripleta tp, tq;
        p = primerNodo();
        while (!finRecorrido(p)) {
            q = p.getLigaDer();
            while (q != p) {
                tq = (Tripleta) q.getTri();
                qf = tq.getFila();
                qc = tq.getColumna();
                qv = (int) tq.getValor();
                System.out.println("fila:" + qf + "columna" + qc + "valor" + qv);
                q = q.getLigaDer();
            }
            tp = p.getTri();
            p = (NodoDoble) tp.getValor();
        }
    }

    public int retornaDato(int f, int c) {
        int qf, qc, qv = 0;
        NodoDoble p, q;
        Tripleta tp, tq;
        p = primerNodo();
        while (!finRecorrido(p)) {
            q = p.getLigaDer();
            while (q != p) {
                tq = (Tripleta) q.getTri();
                qf = tq.getFila();
                qc = tq.getColumna();
                if (qf == f && qc == c) {
                    qv = (int) tq.getValor();
                }
                q = q.getLigaDer();
            }
            tp = p.getTri();
            p = (NodoDoble) tp.getValor();
        }
        return qv;
    }
     public NodoDoble retornaNodo(int f, int c) {
        int qf, qc;
        NodoDoble p, q,retorno=null;
        Tripleta tp, tq;
        p = primerNodo();
        while (!finRecorrido(p)) {
            q = p.getLigaDer();
            while (q != p) {
                tq = (Tripleta) q.getTri();
                qf = tq.getFila();
                qc = tq.getColumna();
                if (qf == f && qc == c) {
                    
                    retorno=q;
                }
                q = q.getLigaDer();
            }
            tp = p.getTri();
            p = (NodoDoble) tp.getValor();
        }
        return retorno;
    }
 public int retornaDatoMCostos(int f, int c) {
        int qf, qc, qv = -1;
        NodoDoble p, q;
        Tripleta tp, tq;
        p = primerNodo();
        while (!finRecorrido(p)) {
            q = p.getLigaDer();
            while (q != p) {
                tq = (Tripleta) q.getTri();
                qf = tq.getFila();
                qc = tq.getColumna();
                if (qf == f && qc == c) {
                    qv = (int) tq.getValor();
                }
                q = q.getLigaDer();
            }
            tp = p.getTri();
            p = (NodoDoble) tp.getValor();
        }
        return qv;
    }
     
     
     
}
