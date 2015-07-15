/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.rota;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.Navio;
import br.ifes.edu.poo.malhaaquaviaria.cdp.rota.util.EnumRotas;
import java.util.HashMap;

/**
 *  
 * @author aeller
 */

public class Rota {
    private int id;
    private Porto origem;
    private Porto destino;
    private float distancia;
    
    private HashMap<Navio, Float> posicaoNavio = new HashMap();
    
    
    private EnumRotas tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public Porto getOrigem() {
        return origem;
    }

    public void setOrigem(Porto origem) {
        this.origem = origem;
    }

    public Porto getDestino() {
        return destino;
    }

    public void setDestino(Porto destino) {
        this.destino = destino;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public EnumRotas getTipo() {
        return tipo;
    }

    public void setTipo(EnumRotas tipo) {
        this.tipo = tipo;
    }

    public HashMap<Navio, Float> getPosicaoNavio() {
        return posicaoNavio;
    }

    public void setPosicaoNavio(HashMap<Navio, Float> posicaoNavio) {
        this.posicaoNavio = posicaoNavio;
    }
    
    
    
    
}
