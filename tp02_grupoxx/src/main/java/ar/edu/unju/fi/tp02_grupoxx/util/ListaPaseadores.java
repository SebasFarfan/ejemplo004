package ar.edu.unju.fi.tp02_grupoxx.util;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unju.fi.tp02_grupoxx.model.Paseador;

public class ListaPaseadores {
    private List<Paseador> paseadores;


    public ListaPaseadores() {
        this.paseadores = new ArrayList<Paseador>();
    }


    public List<Paseador> getPaseadores() {
        return this.paseadores;
    }

    public void setPaseadores(List<Paseador> paseadores) {
        this.paseadores = paseadores;
    }


}
