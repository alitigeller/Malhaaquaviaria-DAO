/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.builder;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.Navio;
import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.NavioCarga;

/**
 *
 * @author aeller
 */
public class GraneleiroBuilder extends NavioBuilder {
    private NavioCarga navioInProgress;
    
    
    public GraneleiroBuilder(Navio graneleiro){
        navioInProgress = (NavioCarga) graneleiro;
    }

    
    @Override
    public void buildCapacidadeCarga() {
        navioInProgress.setCapacidadeCarga(200);
    }

    @Override
    public void buildCapacidadePessoas() {
        navioInProgress.setCapacidadePessoas(6);
    }

    public Navio getNavio() {
        return navioInProgress;
    }
    
    
}
