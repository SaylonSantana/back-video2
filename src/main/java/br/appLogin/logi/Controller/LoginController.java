package br.appLogin.logi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import br.appLogin.logi.model.Usuario;
import br.appLogin.logi.repository.UsuarioRepository;

import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping
public class LoginController {

    @Autowired
    private UsuarioRepository ur;

    // Exibe a página de login
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    // Exibe a página de cadastro
    @GetMapping("/cadastroUsuario")
    public String cadastro() {
        return "cadastro";
    }

    // Processa o cadastro do usuário
    @PostMapping("/cadastroUsuario")
    public String cadastroUsuario(@Valid Usuario usuario, BindingResult result) {
        if (result.hasErrors()) {
            return "redirect:/cadastroUsuario";
        }

        ur.save(usuario);
        return "redirect:/login.html";
    }

    // Autentica o usuário
    @PostMapping("/login")
    @ResponseBody
    public String autenticarUsuario(@RequestParam String email, @RequestParam String senha) {
        Usuario usuario = ur.findByEmail(email);

        if (usuario != null && usuario.getSenha().equals(senha)) {
            return "sucesso";
        } else {
            return "erro";
        }
    }
}
