package com.marcelo.controladores;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.marcelo.dao.DAOAssunto;
import com.marcelo.dao.DAOUsuario;

@Controller
public class HomeController {
	@Autowired
	private DAOUsuario daoUsuario;
	
	@Autowired
	private DAOAssunto daoAssunto;
	
	public String index(Map<String, Object> model){
		model.put("assuntos", getDaoAssunto().list());
		model.put("usuarios", getDaoUsuario().list());
		return "index";
	}

	public DAOUsuario getDaoUsuario() {
		return daoUsuario;
	}

	public void setDaoUsuario(DAOUsuario daoUsuario) {
		this.daoUsuario = daoUsuario;
	}

	public DAOAssunto getDaoAssunto() {
		return daoAssunto;
	}

	public void setDaoAssunto(DAOAssunto daoAssunto) {
		this.daoAssunto = daoAssunto;
	}
}
