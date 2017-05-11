
package com.github.izaquias.artigoswsrest.servicos;

import com.github.izaquias.artigoswsrest.dao.ArtigoBDFake;
import com.github.izaquias.artigoswsrest.modelo.Artigo;
import java.util.List;

/**
 *
 * @author Izaquias
 */
public class ArtigoServico {
    
    private List<Artigo> listado =  ArtigoBDFake.getInstance().getListado();
    
    public List<Artigo> getArtigos(){
        return listado;
    }
    
    public Artigo getArtigo(int id){
        for(Artigo artigo : listado){
            if(artigo.getId() == id){
                return artigo;
            }
        }
        return null;
    }
    
    public Artigo adicionarArtigo(Artigo artigo){
        artigo.setId(getMaximo());
        return artigo;
    }
    
    public Artigo atualizarArtigo(Artigo artigo){
        int posicao = getPosicao(artigo.getId());
        try{
        listado.set(posicao, artigo);
        }catch(IndexOutOfBoundsException ioobe){
            return null;
        }
        return artigo;
    }
    
    public void deletarArtigo(int id){
        int posicao = getPosicao(id);
        listado.remove(id);
    }
    
    private int getPosicao(int id){
        for(int i = 0; i < listado.size(); i++){
            if(listado.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }
    
    private int getMaximo(){
        int tamanho = listado.size();
        if(tamanho > 0){
            return listado.get(tamanho - 1).getId() + 1;
        }else{
            return 1;
        }
            
    }
}
