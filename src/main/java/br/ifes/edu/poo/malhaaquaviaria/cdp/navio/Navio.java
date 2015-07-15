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
public interface Navio extends Cloneable{
   
    public Object clone(); 
    
    public int getId();
    public void setId(int id);
    
    public Enum getTipo();
    public void setTipo(Enum tipo);
    
    public int getCapacidadePessoas();
    public void setCapacidadePessoas(int i);

    public int getQtdPessoas();
    public void setQtdPessoas(int i);
}
