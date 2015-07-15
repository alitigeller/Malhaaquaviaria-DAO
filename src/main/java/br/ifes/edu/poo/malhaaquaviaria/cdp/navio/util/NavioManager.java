/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.factory.Factory;
import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.Navio;
/**
 *
 * @author aeller
 */
public enum NavioManager {
    NAVIO;
    private Navio NavioCargas, NavioPassageiros;
    
    Factory factory = new Factory();
    
    public synchronized Navio createCruzeiro(){
        if(NavioPassageiros == null){
            NavioPassageiros = factory.create(EnumNavio.NavioPassageiros);
            NavioPassageiros.setTipo(EnumNavioPassageiros.Cruzeiro);
            return NavioPassageiros;
        }else{
            NavioPassageiros.setTipo(EnumNavioPassageiros.Cruzeiro);
            return (Navio) NavioPassageiros.clone();
        }
    }
    
    public synchronized Navio createEscuna(){
        if(NavioPassageiros == null){
            NavioPassageiros = factory.create(EnumNavio.NavioPassageiros);
            NavioPassageiros.setTipo(EnumNavioPassageiros.Escuna);
            return NavioPassageiros;
        }else{
            NavioPassageiros.setTipo(EnumNavioPassageiros.Escuna);
            return (Navio) NavioPassageiros.clone();
        }
    }
    
    public synchronized Navio createCargaGeral(){
        if(NavioCargas == null){
            NavioCargas = factory.create(EnumNavio.NavioCargas);
            NavioPassageiros.setTipo(EnumNavioCarga.CargaGeral);
            return NavioCargas;
        }else{
            NavioPassageiros.setTipo(EnumNavioCarga.CargaGeral);
            return (Navio) NavioCargas.clone();
        }
    }
    
    
    public synchronized Navio createGraneleiro(){
        if(NavioCargas == null){
            NavioCargas = factory.create(EnumNavio.NavioCargas);
            NavioPassageiros.setTipo(EnumNavioCarga.Graneleiro);
            return NavioCargas;
        }else{
            NavioPassageiros.setTipo(EnumNavioCarga.Graneleiro);
            return (Navio) NavioCargas.clone();
        }
    }
}
