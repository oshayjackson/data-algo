package com.publicutilities.water;

import static org.junit.Assert.assertEquals;

import java.time.Month;
import org.junit.Before;
import org.junit.Test;

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

    @Test
    public void testGetTotalCost_winter() {
        assertEquals(77.0, winterBill1.getTotalCost(), .001);  // 2650 gal
        assertEquals(98.0, winterBill2.getTotalCost(), .001);  // 4500 gal
    }

    @Test
    public void testGetTotalCost_summer() {
        assertEquals(58.0, summerBill1.getTotalCost(), .001);  // 1300 gal
        assertEquals(67.0, summerBill2.getTotalCost(), .001);  // 1950 gal
    }

    @Test
    public void testGetSewerCost_winter() {
        assertEquals(24.0, winterBill1.getSewerCost(), .001);  // 2650 gal
        assertEquals(36.0, winterBill2.getSewerCost(), .001);  // 4500 gal
    }

    @Test
    public void testGetSewerCost_summer() {
        assertEquals(8.0, summerBill1.getSewerCost(), .001);  // 1300 gal
        assertEquals(12.0, summerBill2.getSewerCost(), .001);  // 1950 gal
    }

    @Test
    public void testGetWaterCost_winter() {
        assertEquals(18.0, winterBill1.getWaterCost(), .001);  // 2650 gal
        assertEquals(27.0, winterBill2.getWaterCost(), .001);  // 4500 gal
    }

    @Test
    public void testGetWaterCost_summer() {
        assertEquals(15.0, summerBill1.getWaterCost(), .001);  // 1300 gal
        assertEquals(20.0, summerBill2.getWaterCost(), .001);  // 1950 gal
    }

    @Test
    public void testGetCCFSewer_winter() {
        assertEquals(6, winterBill1.getCCFWater());  // 2650 gal
        assertEquals(9, winterBill2.getCCFWater());  // 4500 gal
    }

    @Test
    public void testGetCCFSewer_summer() {
        assertEquals(2, summerBill1.getCCFSewer());  // 1300 gal
        assertEquals(3, summerBill2.getCCFSewer());  // 1950 gal
    }

    @Test
    public void testGetCCFWater_winter() {
        assertEquals(6, winterBill1.getCCFWater());  // 2650 gal
        assertEquals(9, winterBill2.getCCFWater());  // 4500 gal
    }

    @Test
    public void testGetCCFWater_summer() {
        assertEquals(3, summerBill1.getCCFWater());  // 1300 gal
        assertEquals(4, summerBill2.getCCFWater());  // 1950 gal
    }

    @Test
    public void testGallonsToCCF() {
        assertEquals(3, WaterBill.gallonsToCCF(1450));
        assertEquals(2, WaterBill.gallonsToCCF(1000));
        assertEquals(2, WaterBill.gallonsToCCF(600));
        assertEquals(1, WaterBill.gallonsToCCF(500));
        assertEquals(1, WaterBill.gallonsToCCF(250));
        assertEquals(0, WaterBill.gallonsToCCF(0));
    }
}