package com.company;
import org.junit.Assert;
import org.junit.Test;


public class Tests {

    @Test
    public void isnotPalindrome() {
        Palindrome palTest=new Palindrome();
        String stringTest="CHROMECOMDO";
        Assert.assertTrue(palTest.isnotPalindrome(stringTest));

    }

    @Test
    public void itisPalindrome(){
        Palindrome palTest=new Palindrome();
        String stringTest="RACECAR";
        Assert.assertFalse(palTest.isnotPalindrome(stringTest));
    }

    @org.junit.Test
    public void separateCSV() {
        Paragraph ptest=new Paragraph();
        ptest.csvList();
        String CSVList="NANNAN,NEN,NEVEN,NON,NMN,OGOPOOGO";
        ptest.csvList();
        ptest.separateCSV(CSVList);

        int actual=0;
        int expected=6;

        for (int i=0;i<ptest.separatedCSV.length;i++)
        {
            if (ptest.separatedCSV[i]!=null)
            {
                actual++;
            }
        }
        Assert.assertEquals(expected,actual);
    }


}