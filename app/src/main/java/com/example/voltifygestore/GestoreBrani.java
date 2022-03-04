package com.example.voltifygestore;

import android.content.Context;

import java.util.ArrayList;
import java.util.Date;

public class GestoreBrani {
    //creazione arraylist
    //ArrayList<Brano> listaBrani;
    //creazione contesto
    Context c;
    //creazione gestore
    Gestore g;

    //costruttore
    public GestoreBrani (Context c)
    {
        //listaBrani = new ArrayList<>();
        this.c=c;
        g= new Gestore(c,"Brani");

    }
    //metodo di aggiunta di un brano
    /*public void addBrano(String titolo, int durata, String autore, Date datacreazione, String genere)
    {
        Brano b= new Brano(titolo,durata, autore, datacreazione, genere); //creazione varabile brano e invocazione del costruttore
        listaBrani.add(b); //aggiunta di un brano alla varibile listabrani tramite il metodo add
    }*/
    public void addBranoFile(String titolo, int durata, String autore, Date datacreazione, String genere, int n){
        Brano b= new Brano(titolo,durata, autore, datacreazione, genere);
        if(n == 1){
            g.scriviFile(b.toString());
        }else{
            g.scriviFileAppend(b.toString());
        }


    }

    /*public StringBuilder ListaBrani(){
        int n=1;
        String s;
        StringBuilder stbui= new StringBuilder(1200); //creazione della variabile stringbuilder
        for(Brano Brv : listaBrani){
            s= "Brano n." + n + "\n";
            stbui.append(s); //aggiunta alla variiabile stringbuilder il numero di brani
            stbui.append(Brv.toString()); //aggiunta alla variiabile stringbuilder il brano
            stbui.append("\n");
            n++;
        }
        return stbui;
    }*/
    public StringBuilder leggiBranidafile(){
        return g.leggiFile();
    }

}
