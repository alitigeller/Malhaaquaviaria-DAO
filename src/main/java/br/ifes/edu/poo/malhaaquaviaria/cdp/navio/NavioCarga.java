/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.navio;

/**
 *
 * @author Alessandro Eller
 */
import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.EnumNavioCarga;

public class NavioCarga implements Navio{
    private int id;
    private Enum tipo;
    private int capacidadeCarga;
    private int capacidadePessoas;
    
    private int qtdCarga;
    private int qtdPessoas;
    
    public NavioCarga() {
    }   

    public int getQtdCarga() {
        return qtdCarga;
    }

    public void setQtdCarga(int qtdCarga) {
        this.qtdCarga = qtdCarga;
    }

    @Override
    public int getQtdPessoas() {
        return qtdPessoas;
    }

    @Override
    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }
    
    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }

    @Override
    public Enum getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(Enum tipo) {
        this.tipo = tipo;
    }
        
    
    public Object clone(){
        Object obj = null;
        try{
          obj=super.clone();
        }catch(CloneNotSupportedException x){
            
        }
        return obj;
    }
}
    