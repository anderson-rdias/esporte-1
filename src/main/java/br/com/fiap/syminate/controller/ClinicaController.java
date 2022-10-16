package br.com.fiap.syminate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.syminate.model.Clinica;
import br.com.fiap.syminate.repository.PsicologoRepository;
import br.com.fiap.syminate.repository.ClinicaRepository;

@Controller
@RequestMapping("clinica")
public class ClinicaController {

    @Autowired
    private ClinicaRepository repository;

    @Autowired
    private PsicologoRepository psicologoRepository;

    @GetMapping("detalhes/{id}")
    public String detalhar(@PathVariable("id") int codigo, Model model){
        model.addAttribute("clinica", repository.findById(codigo).get());
        model.addAttribute("psicologos", psicologoRepository.findByClinica_Codigo(codigo));
        return "clinica/detalhes";
    }

    @GetMapping("listar")
    public String listar(Model model){
        model.addAttribute("clinicas", repository.findAll());
        return "clinica/lista";
    }

    @GetMapping("cadastrar")
    public String cadastrar(Clinica clinica){
        return "clinica/form";
    }

    @PostMapping("cadastrar")
    public String cadastrar(Clinica clinica, RedirectAttributes redirect){
        repository.save(clinica);
        redirect.addFlashAttribute("msg","Cadastrado!");
        return "redirect:/clinica/cadastrar";
    }

}
