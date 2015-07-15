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
public class CargaGeralBuilder extends NavioBuilder{
    private NavioCarga navioInProgress;
    
    public CargaGeralBuilder(Navio cargageral){
        navioInProgress = (NavioCarga) cargageral;
    }

    @Override
    public void buildCapacidadeCarga() {
        navioInProgress.setCapacidadeCarga(150);
                
    }

    @Override
    public void buildCapacidadePessoas() {
        navioInProgress.setCapacidadePessoas(12);    
    }

    @Override
    public Navio getNavio() {
        return navioInProgress;
    }
    
    
    
}
