package sensei;

import java.util.List;

import engine.Koan;

/**
 * All the widom of the master, materialized in the series of all available koans.
 */
public final class Wisdom {
    public static final List<List<Koan>> koans = List.of(
        // Section 1
        AboutConsoleAndVariablesKoans.koans,
        AboutDecimalNumbersKoans.koans,
        // Section 2
        AboutMethodsKoans.koans,
        AboutMoreMethodsKoans.koans,
        AboutConditionsKoans.koans,
        // Section 3
        AboutLoopsKoans.koans,
        AboutClassesKoans.koans,
        // Section 4
        AboutArraysKoans.koans,
        AboutObjectsKoans.koans,
        // Review Game
        AboutNot7GameKoans.koans
    );
}
