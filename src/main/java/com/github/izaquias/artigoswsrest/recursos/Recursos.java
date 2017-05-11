/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.izaquias.artigoswsrest.recursos;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Izaquias
 */

@Path("/recursos")
public class Recursos {
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String saudar(){
        return "Outro trabalho de teste com rest";
    }
    
}
