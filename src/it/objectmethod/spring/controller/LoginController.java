package it.objectmethod.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

	// 1) Una finta login che fa uscire lo username nella seconda pagina;
	@RequestMapping("/loginForm")
	public String login() {
		return "formUser";
	}

	@RequestMapping("/viewUs")
	public String viewUsername(@RequestParam("username") String user, @RequestParam("password") String passw,
			ModelMap model) {
		model.addAttribute("username", user);
		model.addAttribute("password", passw);

		return "viewUserData";
	}

	/*
	 * 2) Un controller che utilizzi le pathvariable prendendo in input un codice di
	 * 3 lettere e lo stampi nella pagina che visualizzi
	 */
	@RequestMapping("/supermarket/codice/{cod}/view")
	public String getCod(@PathVariable("cod") Integer codice, ModelMap model) {
		model.addAttribute("cod", codice);

		return "viewCod";
	}

	/*
	 * 3) Un controller che faccia una forward a un secondo controller (ed entrambi
	 * i controller devono aggiungere qualcosa agli attribute della model map)
	 * semplicemente li stampi nella pagina successiva
	 */
	@RequestMapping("/provaForw")
	public String sendAttrib(ModelMap model) {
		String oneAttr = "Andrea";

		model.addAttribute("name", oneAttr);
		return "forward:/provaForwTwo";
	}

	@RequestMapping("/provaForwTwo")
	public String sendAttribTwo(ModelMap model) {

		String twoAttrib = "Veriglione";
		model.addAttribute("surname", twoAttrib);
		return "viewForw";
	}

}
