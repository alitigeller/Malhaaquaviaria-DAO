/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.dao.factory;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.EnumNavio;
import br.ifes.edu.poo.malhaaquaviaria.dao.DAO;
import java.util.HashMap;

/**
 *
 * @author aeller
 */
public class DAONaviosFactory {
    private HashMap<Enum, DAO> daoFactory = new HashMap();
    
    public DAONaviosFactory(){
        daoFactory.put(EnumNavio.NavioCargas,new NavioCargaDAOFactory().Create());
        daoFactory.put(EnumNavio.NavioPassageiros,new NavioPassageirosDAOFactory().Create());
    }
    
    public DAO Create(EnumNavio tipo){
        return daoFactory.get(tipo);
    }
}
