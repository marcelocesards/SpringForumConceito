package com.marcelo.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller("usuario")
@SessionAttributes("usuario")
public class UsuarioController {
	@RequestMapping
	public ModelAndView infoAutenticado(@ModelAttribute("usuario") Usuario usuario){
		ModelAndView mav = new ModelAndView("usuario/show");
		mav.getModel().put("usuario", usuario);
		return mav;
	}
}
