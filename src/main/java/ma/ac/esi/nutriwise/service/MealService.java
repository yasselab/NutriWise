package ma.ac.esi.nutriwise.service;


import ma.ac.esi.nutriwise.model.Meal;
import ma.ac.esi.nutriwise.repository.MealRepository;

import java.util.List;

public class MealService {
    private final MealRepository mealRepository;

    public MealService() {
        this.mealRepository = new MealRepository();
    }

    public List<Meal> getAllMeals() {
        return mealRepository.getAllMeals();
    }
}