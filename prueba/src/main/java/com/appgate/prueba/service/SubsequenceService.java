package com.appgate.prueba.service;

import com.appgate.prueba.domain.SubsequenceCounter;

public class SubsequenceService {

    private final SubsequenceCounter counter;

    public SubsequenceService() {
        this.counter = new SubsequenceCounter();
    }

    public int getCount(String s, String t) {
        if (s == null || t == null) {
            throw new IllegalArgumentException("Inputs must not be null");
        }
        return counter.countDistinctSubsequences(s, t);
    }
}
