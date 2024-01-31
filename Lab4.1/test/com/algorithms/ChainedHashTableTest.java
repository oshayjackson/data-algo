package com.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ChainedHashTableTest {

    private ChainedHashTable<Integer, String> chainedHashTable;

    @Before
    public void setup() {
        chainedHashTable = new ChainedHashTable<>(10, new RemainderHashing());
        chainedHashTable.put(12, "Isabel");
        chainedHashTable.put(22, "Ruth");
        chainedHashTable.put(32, "Michelle");
        chainedHashTable.put(11, "James");
        chainedHashTable.put(21, "John");
        chainedHashTable.put(31, "Peter");
    }

    @Test
    public void put() {
        String expected = "Ken";
        chainedHashTable.put(88, "Ken");
        String actual = chainedHashTable.get(88).toString();
        assertEquals(expected, actual);
    }

    @Test
    public void get() {
        String expected = "James";
        String actual = chainedHashTable.get(11);
        assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        chainedHashTable.remove(12);
        assertNull(chainedHashTable.get(12));
    }

}