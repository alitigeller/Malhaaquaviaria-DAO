/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.cdp.rota;



/**
 *
 * @author aeller
 */
public interface IPorto extends Cloneable{
    
    public Object clone();
    
    public int getId();
    public void setId(int id);
    
    public String getNome();
    public void setNome(String nome);
}
