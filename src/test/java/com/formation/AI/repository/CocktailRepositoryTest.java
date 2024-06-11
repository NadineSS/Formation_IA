package com.formation.AI.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.formation.AI.model.CocktailModel;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CocktailRepositoryTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private CocktailRepository cocktailRepository;

    @Test
    public void testGetCocktailsSuccess() {
        // Mock the API response
        CocktailModel[] mockCocktails = { new CocktailModel(), new CocktailModel() };
        CocktailApiResponse mockResponse = new CocktailApiResponse();
        mockResponse.setDrinks(mockCocktails);
        ResponseEntity<CocktailApiResponse> responseEntity = new ResponseEntity<>(mockResponse, HttpStatus.OK);
        when(restTemplate.getForEntity(
                anyString(),
                eq(CocktailApiResponse.class)))
                .thenReturn(responseEntity);

        // Call the method being tested
        List<CocktailModel> result = cocktailRepository.getCocktails();

        // Assertions
        assertEquals(Arrays.asList(mockCocktails), result);
    }

    @Test
    public void testGetCocktailsError() {
        // Mock an error response
        ResponseEntity<CocktailApiResponse> responseEntity = new ResponseEntity<>(null,
                HttpStatus.INTERNAL_SERVER_ERROR);
        when(restTemplate.getForEntity(
                anyString(),
                eq(CocktailApiResponse.class)))
                .thenReturn(responseEntity);

        // Call the method being tested
        List<CocktailModel> result = cocktailRepository.getCocktails();

        // Assertions
        assertNull(result);
    }
}
