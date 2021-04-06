package io.murad.tacos.controller;

import io.murad.tacos.model.Ingredient;
import io.murad.tacos.model.Taco;
import io.murad.tacos.service.TacoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {
    private TacoService tacoService;
    @GetMapping
    public String showDesignForm(Model model,Taco taco){
        List<Ingredient> ingredients = taco.getIngredients();
        model.addAttribute("ingredients",ingredients);
        model.addAttribute("design",new Taco());
        return "design";
    }

    @PostMapping
    public String processDesign(@Valid Taco design, Errors errors) {
        if (errors.hasErrors()){
            return "design";
        }
        // Save the taco design...
        tacoService.save(design);
        // We'll do this in chapter 3
        log.info("Processing design: " + design);
        return "redirect:/orders/current";
    }

}
