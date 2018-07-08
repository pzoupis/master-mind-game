package me.pzoupis.mastermind.domain;

import java.util.Arrays;
import java.util.Collection;

public class TestCaseProvider {
    public static Collection provideCodeValidationCases() {
        return Arrays.asList(new int[][][] {
            {{ 1, 2, 3, 4 }, { 1, 2, 3, 4 }, { 4, 0 }},
            {{ 1, 2, 3, 4 }, { 2, 2, 3, 3 }, { 2, 0 }},
            {{ 1, 2, 3, 1 }, { 2, 2, 3, 1 }, { 3, 0 }}
        });
    }
}
