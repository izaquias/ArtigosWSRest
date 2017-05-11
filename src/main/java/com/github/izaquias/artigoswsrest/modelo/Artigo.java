
package com.github.izaquias.artigoswsrest.modelo;

import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Izaquias
 */
@XmlRootElement
public class Artigo {
    private int id;
    private String titulo;
    private String conteudo;
    private Calendar criado;
    private String autor;

    public Artigo() {
    }

    public Artigo(int id, String titulo, String conteudo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.autor = autor;
        this.criado = new GregorianCalendar();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Calendar getCriado() {
        return criado;
    }

    public String getAutor() {
        return autor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setCriado(Calendar criado) {
        this.criado = criado;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
}
