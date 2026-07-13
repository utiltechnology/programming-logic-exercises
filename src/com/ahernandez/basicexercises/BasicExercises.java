package com.ahernandez.basicexercises;

import java.text.Normalizer;
/**
 * Proporciona un conjunto de ejercicios y utilidades básicas para la manipulación
 * y procesamiento de datos primitivos y cadenas de texto en Java.
 *
 * @author ahernandez
 * @version 1.0
 */
public class BasicExercises {

//    Dado un string, devuelve una nueva cadena
//    donde cada letra tiene su capitalización invertida:
//    las letras mayúsculas se convierten en minúsculas y viceversa.
//    Los caracteres que no son letras (números, espacios, signos de puntuación) no cambian.


    /**
     * Invierte la capitalización de cada letra en una cadena de texto dada.
     * <p>
     * Las letras mayúsculas se convierten en minúsculas y las minúsculas en mayúsculas.
     * Las letras que contienen acentos o tildes se mantienen intactas en su estado original.
     * Los caracteres que no son letras (tales como números, espacios en blanco y
     * signos de puntuación) se preservan sin sufrir modificaciones.
     * </p>
     *
     * @param text La cadena de texto original que se desea procesar.
     * @return Una nueva cadena de texto con la capitalización de sus letras invertida
     *         y los caracteres especiales preservados.
     */
    public static String swapCase(String text) {
        String convertedText = "";

        for (int i = 0; i < text.length(); i++) {
            String normalizeText = Normalizer.normalize(String.valueOf(text.charAt(i)), Normalizer.Form.NFD);
            if (Character.isLetter(text.charAt(i))) {
                if (normalizeText.length() > 1) {
                    convertedText += text.charAt(i);
                }
                if (Character.isUpperCase(text.charAt(i)) && normalizeText.length() < 2) {
                    convertedText += Character.toLowerCase(text.charAt(i));
                } else if (Character.isLowerCase(text.charAt(i)) && normalizeText.length() < 2) {
                    convertedText += Character.toUpperCase(text.charAt(i));
                }
            }
            else {
                convertedText += text.charAt(i);
            }
        }
        return convertedText;
    }

    /**
     * Reverses the order of a 2-digit integer.
     *
     * @param value The 2-digit integer to be reversed.
     * @return The reversed integer.
     * @throws IllegalArgumentException If the value is not a 2-digit integer.
     *
     */
    public static int reverseTwoDigitInteger(int value) {
        if((value < 10 || value > 99) & (value > -10 || value < -99)) {
            throw new IllegalArgumentException("The value must be a 2-digit integer (between 10 and 99, or -10 and -99). Got: " + value);
        }
        int units = value % 10;
        int tens = (value - units) / 10;
        return (10 * units) + tens;
    }
}
