package com.vishnu;

class DayScholarStudent  implements CollegeFacilitiesFee
{   int BusFee = 5000;

    public void StudentCollegeFee()
    {

        System.out.println("DayScholar college fee " + CollegeFee);
    }
    public void BusFacilityFee()
    {
        System.out.println("Bus Fee is "+BusFee);
    }
    public void HostelFacilityFee()
    {
        System.out.println("DayScholar dont have the Hostel Fee");
    }
    public void StudentTotalFee()
    {
        System.out.println("Total Fee of Student is "+(CollegeFee+BusFee));
    }
}
