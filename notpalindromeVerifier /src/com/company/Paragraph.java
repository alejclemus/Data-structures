package com.company;

public class Paragraph {
    String [] separatedCSV;

    public void csvList(){
        separatedCSV =new String[100];
    }

    public void separateCSV(String CSV){
        separatedCSV=CSV.split(",");
    }

}
