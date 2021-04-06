package io.murad.tacos.repository;

import io.murad.tacos.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient,String> {
}
