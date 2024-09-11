package controller;

import model.Cocktails;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CocktailsService;

import java.util.List;

@Controller
@RequestMapping("/cocktails")
public class CocktailsController {

    private CocktailsService cocktailsService;

    public CocktailsController(CocktailsService cocktailsService) {
        this.cocktailsService = cocktailsService;
    }

    @GetMapping("/cocktails")
    public String listCocktails(Model model) {
        List<Cocktails> cocktailsList = cocktailsService.getCocktailsList();
        model.addAttribute("CocktailName,", cocktailsList);
        return "cocktailsList";
    }

}
