package com.formation.AI.model;

// Suggested code may be subject to a license. Learn more: ~LicenseLog:2179932193.
// Suggested code may be subject to a license. Learn more: ~LicenseLog:1731328194.
// Suggested code may be subject to a license. Learn more: ~LicenseLog:519626736.
// Suggested code may be subject to a license. Learn more: ~LicenseLog:3802497334.
// Suggested code may be subject to a license. Learn more: ~LicenseLog:3554200159.
// Suggested code may be subject to a license. Learn more: ~LicenseLog:549650979.
import lombok.Data;

@Data
public class CocktailModel {
    private String idDrink;
    private String strDrink;
    private String strDrinkAlternate;
    private String strTags;
    private String strVideo;
    private String strCategory;
    private String strIBA;
    private String strAlcoholic;
    private String strGlass;
    private String strInstructions;
    private String strInstructionsES;
    private String strInstructionsDE;
    private String strInstructionsFR;
    private String strInstructionsIT;
    // ... (Add other fields as needed based on sample-data.json)
    private String strImageSource;
    private String strImageAttribution;
    private String strCreativeCommonsConfirmed;
    private String dateModified;

}
