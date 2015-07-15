/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.ifes.edu.poo.malhaaquaviaria.cdp.rota;


import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.Navio;
import java.util.List;

/**
 *
 * @author aeller
 */
public class Porto implements IPorto{
    
    private int id;
    private String nome;
    public List<Navio> navios;

    public Porto() {
    }

    
    
    public Porto(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }
    
    
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Navio> getNavios() {
        return navios;
    }

    public void setNavios(List<Navio> navios) {
        this.navios = navios;
    }
    
    
    
    @Override
    public Object clone(){
        Object obj = null;
        try{
          obj=super.clone();
        }catch(CloneNotSupportedException x){
            
        }
        return obj;
    }
}
