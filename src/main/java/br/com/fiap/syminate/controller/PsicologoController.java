package br.com.fiap.syminate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.syminate.model.Psicologo;
import br.com.fiap.syminate.repository.PsicologoRepository;
import br.com.fiap.syminate.repository.ClinicaRepository;

@Controller
@RequestMapping("psicologo")
public class PsicologoController {

    @Autowired
    private PsicologoRepository psicologoRepository;

    @Autowired
    private ClinicaRepository clinicaRepository;

    @GetMapping("buscar")
    public String buscar(String nomeBusca, Model model ){
        model.addAttribute("psicologos", psicologoRepository.findByNomeContainsIgnoreCase(nomeBusca));
        return "psicologo/lista";
    }

    @GetMapping("listar")
    public String listar(Model model){
        model.addAttribute("psicologos", psicologoRepository.findAll());
        return "psicologo/lista";
    }

    @GetMapping("cadastrar")
    public String cadastrar(Psicologo psicologo, Model model){
        model.addAttribute("clinicas", clinicaRepository.findAll());
        return "psicologo/form";
    }

    @PostMapping("cadastrar")
    public String cadastrar(Psicologo psicologo, RedirectAttributes redirect){
        psicologoRepository.save(psicologo);
        redirect.addFlashAttribute("msg", "Cadastrado");
        return "redirect:/psicologo/cadastrar";
    }

}
