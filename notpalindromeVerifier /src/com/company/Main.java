package com.company;

public class Main {

    public static void main(String[] args) {
        Paragraph par=new Paragraph();
        Palindrome pal=new Palindrome();
        String CSVList="NANNAN,NAURRUAN,NUN,NEN,NEVEN,NON,NMN,NN,NRN,NUN,O,ONO,OKKO,OGOPOOGO,OHO,ONO,OO,OOO,OPPO,OSO,OTO,OTTO,OWO,OKO,P,PAP,PBP,PCP,PULLUP,PUP,PVP,PWP,PZP,Q,QAAANAAQ,QAZAD,QQQ,QQQ,R,RACECARS,RADAR,RAR,REDDER,REER,REFER";
        par.csvList();
        par.separateCSV(CSVList);
        System.out.print("Not palindromes:\n");
        pal.printPalindrome(par.separatedCSV);
    }
}
