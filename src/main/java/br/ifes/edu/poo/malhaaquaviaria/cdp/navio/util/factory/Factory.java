/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.factory;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.Navio;
import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.EnumNavio;
import java.util.HashMap;

/**
 *
 * @author Alessandro Eller
 */
public class Factory {
    
    private HashMap<Enum, Navio> factory = new HashMap();
    
    public Factory(){
        factory.put(EnumNavio.NavioCargas,new NavioCargasFactory().Create());
        factory.put(EnumNavio.NavioPassageiros,new NavioPassageirosFactory().Create());
    }
    
    public Navio create(EnumNavio tipo){
     
        return factory.get(tipo);
     
    }
}
