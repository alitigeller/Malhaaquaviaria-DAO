/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.factory;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.Navio;
import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.NavioCarga;
/**
 *
 * @author Alessandro Eller
 */
public class NavioCargasFactory {
    
    public Navio Create() {
        Navio navioCarga = new NavioCarga();
        return navioCarga;
    }
}
