package co.com.prueba.domain.usecase.util;

public class Validations {

    private Validations() {

    }

    public static boolean isEmpty(final String s) {
        return s == null || s.trim().isEmpty();
    }

    public static boolean isValidLongModel(final String s) {
        return s.length() <= 30;
    }

    public static boolean isValidLongDescription(final String s) {
        return s.length() <= 100;
    }
}
