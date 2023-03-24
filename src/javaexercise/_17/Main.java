package javaexercise._17;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");

        int myBankBalanceEuro = 500;  // non so se modificare direttamente la variabile del mio conto da int a long


        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        // in questo modo ho creato una nuova variabile long

        long questionableFundsEuro = 5_000_000_000l;
        long updatedMyBankBalanceEuro = myBankBalanceEuro + questionableFundsEuro;
        System.out.println(updatedMyBankBalanceEuro);

    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age --------> byte
     *    2b: The age of a baby in months --------> short
     *    2c: Money in a hedgefund in euros --------> long
     *    2d: Price of a good in euros on amazon.com --------> float
     *    2e: The exact weight of an apple measured by scientific equipment --------> double
     *    2f: The number of kilometers from any 2 places in the world --------> float
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate getTime = LocalDate.now();
        SimpleDateFormat format = new SimpleDateFormat ("yyyy-MM-dd");

        int currentMonthDay = getTime.getDayOfMonth();
        DayOfWeek currentDayOfWeek = getTime.getDayOfWeek();
        int dayOfTheYear = getTime.getDayOfYear();
        Month currentMonth = getTime.getMonth();
        int monthValue = getTime.getMonthValue();

        LocalDate dateOne = LocalDate.of(2021, Month.DECEMBER, 5);
        LocalDate dateTwo = LocalDate.of(2023, Month.JANUARY, 24);
        boolean isBefore = dateOne.isBefore(dateTwo);


        if (isBefore) {
            System.out.println(dateOne + " is before " + dateTwo);
        } else {
            System.out.println(dateTwo + " is before " + dateOne);
        }




    }

}
