package com.calculadora.estimacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calculadora.estimacion.entity.FabricaEntity;
import com.calculadora.estimacion.repository.FabricaRepository;

@Controller
@RequestMapping("/fabricas")
public class FabricaController {

    @Autowired
    private FabricaRepository fabricaRepository;

    @PostMapping
    public String guardarFabrica(FabricaEntity fabrica) {
        fabricaRepository.save(fabrica);
        return "redirect:/Formulario.html"; // Redirige de vuelta al formulario después de guardar los datos
    }
    
    @GetMapping("/{id}")
    public String obtenerFabricaPorId(@PathVariable("id") int id, Model model) {
        FabricaEntity fabrica = fabricaRepository.findById(id).orElse(null);
        model.addAttribute("fabrica", fabrica);
        return "fabricaDetalles"; // Crea una vista llamada "fabricaDetalles.html" para mostrar los detalles de la fábrica
    }

    @PutMapping("/{id}")
    public String actualizarFabrica(@PathVariable("id") int id, FabricaEntity fabricaActualizada) {
        FabricaEntity fabrica = fabricaRepository.findById(id).orElse(null);
        if (fabrica != null) {
            fabrica.setNombre(fabricaActualizada.getNombre());
            fabrica.setEstado(fabricaActualizada.getEstado());
            fabrica.setGerente(fabricaActualizada.getGerente());
            fabrica.setEmailContact(fabricaActualizada.getEmailContact());
            fabricaRepository.save(fabrica);
        }
        return "redirect:/Formulario.html";
    }

   /* @DeleteMapping("/{id}")
    public String eliminarFabrica(@PathVariable("id") int id) {
        fabricaRepository.deleteById(id);
        return "redirect:/Formulario.html";
    } */

    @DeleteMapping("/{dni}")
    public String eliminarFabrica(@PathVariable int dni) {
        fabricaRepository.deleteById(dni);
        return "redirect:/Formulario.html";
    }

    
}