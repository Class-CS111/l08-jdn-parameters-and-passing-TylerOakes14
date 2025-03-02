// PARTNER NAME: Tyler Oakes    
// PARTNER NAME: NA
// CS111 SECTION #: 3033
// DATE:03/02/2025
public class Main
{
    public static void main(String[] args)
    {
        //DECLARATRION + INITIALIZATION SECTION
        int month = 0;
        int day = 0;
        int year = 0;
        int jdnDate = 0;
        //INPUT SECTION


        //CALCULATION SECTION
        month = 8;
        day = 26;
        year = 1918;
        jdnDate = Main.calculateJulianDate(month, day, year);


        //OUTPUT SECTION
        System.out.println("The calculated Julian date for Katherine's Birthday is: " + jdnDate);

        month = 7;
        day = 22;
        year = 1995;

        jdnDate = Main.calculateJulianDate(month, day, year);
        System.out.println("The calculated Julian date for my birthday is: " + jdnDate);

        month = 6;
        day = 1;
        year = 2022;

        jdnDate = Main.calculateJulianDate(month, day, year);
        System.out.println("The calculated Julian date for when my daughter was born is: " + jdnDate);
    
        
    
    }
// Description: calculate the Julian date given month day and year
// Precondition:valid integers for month day and year, month < 12
// Postcondition:return an integer, julian date
public static int calculateJulianDate(int month, int day, int year){
    int a = 0;
    int m = 0;
    int y = 0;
    int jdnToday = 0;
    
    a = (14 - month) / 12;
    m = month + 12 * a - 3;
    y = year + 4800 - a;
    jdnToday = day + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

    return jdnToday;

}



}