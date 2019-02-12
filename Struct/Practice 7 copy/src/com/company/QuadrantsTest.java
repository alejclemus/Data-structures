package com.company;


public class QuadrantsTest {

    @org.junit.Test
    public void printQuadrant1() {
        Point testPoint= new Point();
        Quadrants testQuadrant1=new Quadrants();
        testPoint.x=1;
        testPoint.y=2;
        testQuadrant1.printQuadrant();
    }

    @org.junit.Test
    public void printQuadrant2() {
        Point testPoint= new Point();
        Quadrants testQuadrant2=new Quadrants();
        testPoint.x=-2;
        testPoint.y=3;
        testQuadrant2.printQuadrant();
    }

    @org.junit.Test
    public void printQuadrant3() {
        Point testPoint= new Point();
        Quadrants testQuadrant3=new Quadrants();
        testPoint.x=-3;
        testPoint.y=-4;
        testQuadrant3.printQuadrant();
    }

    @org.junit.Test
    public void printQuadrant4() {
        Point testPoint= new Point();
        Quadrants testQuadrant4=new Quadrants();
        testPoint.x=5;
        testPoint.y=-6;
        testQuadrant4.printQuadrant();
    }
}