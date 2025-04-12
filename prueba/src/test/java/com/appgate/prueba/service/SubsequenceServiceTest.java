package com.appgate.prueba.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SubsequenceServiceTest {

    private final SubsequenceService service = new SubsequenceService();

    @Test
    void testSameStrings() {
        assertEquals(1, service.getCount("rabbit", "rabbit"));
    }

    @Test
    void testExample1() {
        assertEquals(3, service.getCount("rabbbit", "rabbit"));
    }

    @Test
    void testExample2() {
        assertEquals(5, service.getCount("babgbag", "bag"));
    }

    @Test
    void testNoPossibleSubsequence() {
        assertEquals(0, service.getCount("abc", "d"));
    }

    @Test
    void testEmptyT() {
        assertEquals(1, service.getCount("abc", ""));
    }

    @Test
    void testEmptyS() {
        assertEquals(0, service.getCount("", "a"));
    }

    @Test
    void testNullInputs() {
        assertThrows(IllegalArgumentException.class, () -> service.getCount(null, "a"));
        assertThrows(IllegalArgumentException.class, () -> service.getCount("a", null));
    }
}
