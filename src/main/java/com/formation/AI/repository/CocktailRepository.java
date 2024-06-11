package com.formation.AI.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import java.util.Arrays;
import java.util.List;

import com.formation.AI.model.CocktailModel;

import lombok.extern.slf4j.Slf4j;


@Repository
@Slf4j
public class CocktailRepository {

    @Value("${api.url}")
    private String apiUrl;

    @Value("${api.url.allCocktails}")
    private String apiUrlAllCocktails;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * This method retrieves a list of cocktails from the API.
     *
     * @return A list of CocktailModel objects, or null if there is an error.
     */
    public List<CocktailModel> getCocktails() {

        try {

            // Make the API call and get the response.
            ResponseEntity<CocktailApiResponse> response = restTemplate.getForEntity(
                    apiUrl + apiUrlAllCocktails,
                    CocktailApiResponse.class);

            // Check if the API call was successful.
            if (response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
                // Return the list of cocktails.
                return Arrays.asList(response.getBody().getDrinks());
            } else {
                // Return null if there is an error.
                return null;
            }
        } catch (HttpClientErrorException  e) {
            log.error("Error fetching cocktails: {} - {}", e.getStatusCode(), e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
