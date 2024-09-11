package service;

import model.Cocktails;
import repository.CocktailsRepository;

import java.util.List;

@org.springframework.stereotype.Service
public class CocktailsService {

    private CocktailsRepository cocktailsRepository;

    public CocktailsService(CocktailsRepository cocktailsRepository) {
        this.cocktailsRepository = cocktailsRepository;
    }

    public List<Cocktails> getCocktailsList() {
        return cocktailsRepository.getCocktailsList();
    }

    public List<Cocktails> getCocktailByIngredient(String ingredient) {
        return cocktailsRepository.getCocktailByIngredient(ingredient);
    }

}
