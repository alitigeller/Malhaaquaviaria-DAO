/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.director;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.builder.NavioBuilder;
import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.Navio;

/**
 *
 * @author aeller
 */
public class GraneleiroDirector extends NavioDirector{

    @Override
    public Navio build(NavioBuilder builder) {
        builder.buildCapacidadePessoas();
        builder.buildCapacidadeCarga();
        return builder.getNavio();
    }
    
    
}
