package br.ifes.edu.poo.malhaaquaviaria.cdp.navio;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro Eller
 */

public class NavioPassageiros implements Navio {
    private int Id;
    private Enum tipo;
    private int capacidadePessoas;
    private int qtdPessoas;
    
    public NavioPassageiros() {
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
        return Id;
    }

    @Override
    public void setId(int Id) {
        this.Id = Id;
    }

    
    
    @Override
    public int getCapacidadePessoas() {
        return capacidadePessoas;
    }

    @Override
    public void setCapacidadePessoas(int capacidadePessoas) {
        this.capacidadePessoas = capacidadePessoas;
    }
   

    

    public Enum getTipo() {
        return tipo;
    }

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
