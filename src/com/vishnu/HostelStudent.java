package com.vishnu;

public class HostelStudent implements CollegeFacilitiesFee{

    int HostelFee=14000;
    public void HostelFacilityFee()
    {
        System.out.println("Hostel Fee is "+HostelFee);
    }
    public void BusFacilityFee()
    {
        System.out.println("Hostel Students dont have Bus Fee");          //Failed to show Single Responsibility
    }
    public void StudentCollegeFee()
    {
        System.out.println("Hostel Student College Fee" + CollegeFee);
    }
    public void StudentTotalFee()
    {
        System.out.println("Total Fee of Student is "+(CollegeFee + HostelFee));
    }
}
