package ru.stepanoff.auth.utils;

public class PasswordUtils {
    private PasswordUtils() {

    }


    public static boolean matches(String rawPassword, String encodedPassword) {
        // dummy password matches function
        String encodedRawPassword = String.valueOf(rawPassword.hashCode());
        return encodedRawPassword.equals(encodedPassword);
    }
}
