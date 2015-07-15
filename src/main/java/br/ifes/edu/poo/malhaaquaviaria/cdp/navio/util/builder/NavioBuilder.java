/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.builder;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.Navio;

/**
 *
 * @author aeller
 */
public abstract class NavioBuilder {
    
    public void buildCapacidadePessoas(){}
    public void buildCapacidadeCarga(){}
    public abstract Navio getNavio();
}
