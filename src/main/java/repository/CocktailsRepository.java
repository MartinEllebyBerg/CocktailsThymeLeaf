package repository;

import model.Cocktails;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class CocktailsRepository {

    private List<Cocktails> cocktailsList;

    public CocktailsRepository() {
        hardcodetCocktails();
    }

    public void hardcodetCocktails() {
        cocktailsList.add(new Cocktails("Dark'n Stormy", Arrays.asList("Barbados Rum", "Lime", "Ginger Beer")));
        cocktailsList.add(new Cocktails("Mojito", Arrays.asList("White Rum", "Lime", "Mint", "Soda Water", "Sugar")));
        cocktailsList.add(new Cocktails("Margarita", Arrays.asList("Tequila", "Lime Juice", "Triple Sec")));
        cocktailsList.add(new Cocktails("Piña Colada", Arrays.asList("White Rum", "Pineapple Juice", "Coconut Cream")));
        cocktailsList.add(new Cocktails("Cosmopolitan", Arrays.asList("Vodka", "Triple Sec", "Cranberry Juice", "Lime Juice")));
    }

    public List<Cocktails> getCocktailsList() {
        return cocktailsList;
    }

    public List<Cocktails> getCocktailByIngredient(String ingredient) {
        List<Cocktails> resultList = new ArrayList<>();
        for (Cocktails c : cocktailsList) {
            if (c.getIngredients().contains(ingredient)) {
                resultList.add(c);
            }
        }
        return resultList;
    }
}
