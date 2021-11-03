package com.gprasad.leetcode.algorithms.hard;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class FileSystemTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void lsEmpty() {
        Assertions.assertArrayEquals(new FileSystem().ls("/").toArray(), new ArrayList<>().toArray());
    }

    @Test
    void mkdir() {
    }

    @Test
    void addContentToFile() {
    }

    @Test
    void readContentFromFile() {
    }
}