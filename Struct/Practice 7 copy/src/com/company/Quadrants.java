package com.company;


class Quadrants {


     int determineQuadrant()
    {
        Point point=new Point();
        if (point.x > 0 && point.y > 0) {
            return 1;
        }
        else if (point.x < 0 && point.y > 0) {
            return 2;
        }
        else if (point.x < 0 && point.y < 0) {
            return 3;
        }
        else if (point.x > 0 && point.y < 0){
            return 4;
        }
        else {
            return 0;
        }
    }

    void printQuadrant(){
        Point point=new Point();
        System.out.print("The point ("+point.x+","+point.y+") is in quadrant "+determineQuadrant());
    }
}
