
package com.github.izaquias.artigoswsrest.recursos;

import com.github.izaquias.artigoswsrest.modelo.Artigo;
import com.github.izaquias.artigoswsrest.servicos.ArtigoServico;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Izaquias
 */
@Path("/artigos")
public class ArtigoRecurso {
    
    ArtigoServico servico = new ArtigoServico();
    
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public List<Artigo> getArtigos(){
         return servico.getArtigos();        
    }
    
    @GET
    @Path("/{artigoId}")
    @Produces(MediaType.APPLICATION_XML)
    public Artigo getArtigo(@PathParam("artigoId") int id){
        return servico.getArtigo(id);
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Artigo inserirArtigo(Artigo artigo){
        return servico.adicionarArtigo(artigo);
    }
    
    @DELETE
    @Path("/{artigoId}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public void removerArtigo(@PathParam("/artigoId") int id){
         servico.deletarArtigo(id);
    }
    
    @PUT
    @Path("/{artigoId}")
    @Consumes(MediaType.APPLICATION_XML)
    @Produces(MediaType.APPLICATION_XML)
    public Artigo modificarArtigo(@PathParam("/artigoId") int id, Artigo artigo){
        artigo.setId(id);
        return servico.atualizarArtigo(artigo);
    }
    
//    @GET
//    //@Produces(MediaType.TEXT_PLAIN)
//    @Produces(MediaType.APPLICATION_XML)
//    public Artigo getArtigos(){
//        Artigo artigo = new Artigo(1, "Droga da Obediencia", "Fatos da realidade", "Izaquias");
//        
//         return artigo;   
//        //return "Artigos retornados com sucesso!";
//    }
    
}
