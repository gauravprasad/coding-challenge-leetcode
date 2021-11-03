package com.gprasad.leetcode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ReverseOnlyLettersTest {
    private ReverseOnlyLetters reverseOnlyLetters = new ReverseOnlyLetters();

    @ParameterizedTest(name = "# {index} - Input String : {0} Expected output : {1}")
    @CsvSource(value = {"ab-cd,dc-ba", "a-bC-dEf-ghIj,j-Ih-gfE-dCba", "Test1ng-Leet=code-Q!,Qedo1ct-eeLg=ntse-T!"})
    void reverseOnlyLetters(String input, String expected) {
        Assertions.assertEquals(reverseOnlyLetters.reverseOnlyLetters(input), expected);
    }
}