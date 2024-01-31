package com.algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack<Customer> custStack = null;

    @Before
    public void setUp() throws Exception {
        custStack = new Stack<>();
    }

    @Test
    public void pushPopEmptyPositive() {
        int expectedCustNo = 12345;
        custStack.push(new Customer(expectedCustNo, "Wendy Smith", 450));
        int actualCustNo = custStack.pop().getCustNo();
        assertEquals(expectedCustNo, actualCustNo);
    }

    @Test
    public void pushPopNonEmptyPositive() {
        int expectedCustNo = 12345;
        custStack.push(new Customer(23456, "Wendy Smith", 450));
        custStack.push(new Customer(expectedCustNo, "Walter Smith", 450));
        int actualCustNo = custStack.pop().getCustNo();
        assertEquals(expectedCustNo, actualCustNo);
    }

    @Test
    public void popEmptyPositive() {
        Customer node = custStack.pop();
        assertNull(node);
    }

    @Test
    public void pushNullEmptyStackPositive() {
        Customer node = custStack.pop();
        assertNull(node);
    }

    @Test
    public void pushNullNonEmptyStackPositive() {
        int expectedCustNo = 23456;
        custStack.push(new Customer(23456, "Wendy Smith", 450));
        custStack.push(null);
        assertEquals(expectedCustNo, custStack.pop().getCustNo());
    }

}