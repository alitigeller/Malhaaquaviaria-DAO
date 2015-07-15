/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.dao.factory;

import br.ifes.edu.poo.malhaaquaviaria.dao.DAO;
import br.ifes.edu.poo.malhaaquaviaria.dao.NavioCargaDAO;

/**
 *
 * @author aeller
 */
public class NavioCargaDAOFactory {
    
    public DAO Create(){
        return new NavioCargaDAO();
    }
}
