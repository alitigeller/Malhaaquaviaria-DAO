/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.poo.malhaaquaviaria.dao;

/**
 *
 * @author aeller
 */
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.NavioCarga;
import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.EnumNavioCarga;
import br.ifes.edu.poo.malhaaquaviaria.cdp.navio.util.NavioManager;

public class NavioCargaDAO extends DAOGeneric implements DAO<NavioCarga> {

	NavioManager manager;
	//CRIANDO A TABELA USUARIO
	public void criarTabela() throws ClassNotFoundException, SQLException
	{
		this.openConnection();
		
		this.execute("DROP TABLE NAVIO");
		
		String sql = "CREATE TABLE NAVIO_CARGA " +
					 " (ID INTEGER GENERATED BY DEFAULT AS IDENTITY "+
                     " (START WITH 1, INCREMENT BY 1) NOT NULL," +
					 " TIPO varchar(255) NOT NULL," +
					 " capacidadePessoas INT NOT NULL," +
                                         " capacidadeCarga INT NOT NULL," +
					 " PRIMARY KEY (ID) )";
		
		this.execute(sql);
		
		this.closeConnection();
	}

	public void insert(NavioCarga obj) throws SQLException, ClassNotFoundException {
		
		this.openConnection();
		
		String sql = "INSERT INTO NAVIO_CARGA (capacidadePessoas, capacidadeCarga, TIPO) VALUES ("+obj.getCapacidadePessoas()+","+obj.getCapacidadeCarga()+",'"+obj.getTipo().toString()+"')"; 
		
		int id = this.executeUpdate(sql);
		
		obj.setId(id);
		
		this.closeConnection();
		
	}

	public void update(NavioCarga obj) {
		// TODO Auto-generated method stub
		
	}

	public void delete(NavioCarga obj) {
		// TODO Auto-generated method stub
		
	}

	public NavioCarga findbyID(Long id) throws ClassNotFoundException, SQLException {
		//Query para buscar o usuario
		this.openConnection();
		
		String sql = "SELECT * FROM NAVIO_CARGA WHERE ID ="+id;
		
		ResultSet rs = this.executeQuery(sql);
		
		List<NavioCarga> navios = retriveNavios(rs);
		
		this.closeConnection();
		
		return navios.get(0);
	}
	public List<NavioCarga> findAll() throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		this.openConnection();
		
		String sql = "SELECT * FROM NAVIO_CARGA ";
		
		ResultSet rs = this.executeQuery(sql);
		
		List<NavioCarga> navios = retriveNavios(rs);
		
		this.closeConnection();
		
		return navios;
	}
	
	private List<NavioCarga> retriveNavios(ResultSet rs) throws SQLException
	{
		List<NavioCarga> navios = new ArrayList<NavioCarga>();
		
		while (rs.next())
		{
			NavioCarga navio = new NavioCarga();
			
			navio.setId(rs.getInt("ID"));
			
			navio.setCapacidadeCarga(rs.getInt("capacidadeCarga"));
                        
                        navio.setCapacidadePessoas(rs.getInt("capacidadePessoas"));
                        
                        navio.setTipo(EnumNavioCarga.valueOf(rs.getString("TIPO")));
			
			navios.add(navio);
		}
		
		return navios;
	}

    
	

}