/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.izaquias.artigoswsrest.dao;

import com.github.izaquias.artigoswsrest.modelo.Artigo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Izaquias
 */
public final class ArtigoBDFake {
    private final static ArtigoBDFake artigoBDFake = new ArtigoBDFake();
    private final List<Artigo> listado = new ArrayList<>();

    private ArtigoBDFake(){
        Artigo a1 = new Artigo(1, "Primeiro Arigo", "Primeiro Conteudo", "Principiante");
        Artigo a2 = new Artigo(2, "Segundo Arigo", "Segundo Conteudo", "Menos Principiante");
        listado.add(a1);
        listado.add(a2);
    }
    
    public static ArtigoBDFake getInstance(){
        return artigoBDFake; 
    }
    
    public List<Artigo> getListado(){
        return listado;
    }
    
}
