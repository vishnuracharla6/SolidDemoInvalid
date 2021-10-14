package com.vishnu;

class CollegeFeeStructure
{

    public void DisplayFeeStructure()
    {
        System.out.println("Fee Structure for DayScholar");
        DayScholarStudent d1 = new DayScholarStudent();
        d1.StudentCollegeFee();
        d1.BusFacilityFee();
        d1.StudentTotalFee();
        HostelStudent h = new HostelStudent();
        h.StudentCollegeFee();
        h.HostelFacilityFee();
        h.StudentTotalFee();
    }
}
