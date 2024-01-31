package com.publicutilities.water;

import java.time.Month;

/**
 * Class definition to model a water utility bill.  There are three components to the bill: Fixed
 * cost for having the service. Water cost, based on usage - defined as all water dispensed from the
 * system. Sewer cost, based on usage - defined as all water that goes "down the drain."
 * <p>
 * Summer is defined as May-Sep, winter is Oct-Apr.
 * <p>
 * Usage is defined in whole gallons, but costs are calculated from CCF. 1 CCF = 500 gal Costs are
 * based on whole CCFs, rounded up - some examples: 1500 gallons = 3 CCF 1600 gallons = 4 CCF 2400
 * gallons = 5 CCF
 * <p>
 * Bills are calculated based on the following: Fixed cost is $35 per month, year-round.
 * <p>
 * Water cost: 1 CCF costs $5.00 in summer and $3.00 in winter.
 * <p>
 * Sewer cost: 1 CCF costs $4.00 year-round. In winter, every gallon of water consumed is considered
 * "down the drain" (goes to sewer). In summer, only 75% of the water consumed is considered "down
 * the drain." This is because some water is used for gardens, power washers, etc.
 */
public class WaterBill {

    private Month month;
    private int ccfWater;
    private int ccfSewer;

    /*
     * The month and gallons consumed are defined at instantiation.
     */
    public WaterBill(Month month, int gallons) {

    }

    public double getTotalCost() {
        return 0.0;
    }

}
