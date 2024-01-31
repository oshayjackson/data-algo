package com.publicutilities.water;

import java.time.Month;
import org.junit.Before;

public class WaterBillTest {

    private WaterBill winterBill1;
    private WaterBill winterBill2;
    private WaterBill summerBill1;
    private WaterBill summerBill2;

    @Before
    public void setUp() {
        winterBill1 = new WaterBill(Month.OCTOBER, 2650);
        winterBill2 = new WaterBill(Month.APRIL, 4500);

        summerBill1 = new WaterBill(Month.MAY, 1300);
        summerBill2 = new WaterBill(Month.SEPTEMBER, 1950);
    }
}