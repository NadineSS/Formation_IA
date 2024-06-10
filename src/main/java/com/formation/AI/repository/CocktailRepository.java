package com.formation.AI.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.List;
import com.formation.AI.model.CocktailModel;


@Repository
public class CocktailRepository {

    @Value("${api.url}")
    private String apiUrl;

    @Value("${api.url.allCocktails}")
    private String apiUrlAllCocktails;

    public List<CocktailModel> getCocktails() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<CocktailApiResponse> response = restTemplate.getForEntity(
                apiUrl + apiUrlAllCocktails,
                CocktailApiResponse.class
        );

        if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
            return Arrays.asList(response.getBody().getDrinks());
        } else {
            return null;
        }
    }


    private static class CocktailApiResponse {
        private CocktailModel[] drinks;

        public CocktailModel[] getDrinks() {
            return drinks;
        }

        public void setDrinks(CocktailModel[] drinks) {
            this.drinks = drinks;
        }
    }
}
