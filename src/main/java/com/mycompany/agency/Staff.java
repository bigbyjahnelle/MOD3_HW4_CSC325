package com.mycompany.agency;



// Jahnelle to complete Staff. java
public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 emploees to the staffList
        staffList[0] = new Executive(
                "Cobin Black",
                "34 Farmingdale Ave",
                "564-8749",
                "234-54-0949",
                2500.00
        );
        staffList[1] = new StaffEmployee(
                "Jade Israel",
                "12 OmwtoheavenYes Road",
                "987-3453",
                "345-23-5432",
                1800.00
        );
        staffList[2] = new StaffEmployee(
                "Jayden Montalvo",
                "90 Victory Boulevard",
                "834-9385",
                "239-31-9329",
                1950.00
        );
        staffList[3] = new TempEmployee(
                "Lixsy Cheong",
                "24 Bethlehem Road",
                "349-3455",
                "783-09-9089",
                20.00
        );
        staffList[4] = new Intern(
                "Damani Strawn",
                "12 Heavenbound Street",
                "789-8342"
        );
        staffList[5] = new StaffEmployee(
                "Adrianna Multivado",
                "90 Bridge Road",
                "960-3495",
                "945-98-0395",
                2100.00
        );
        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmployee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
