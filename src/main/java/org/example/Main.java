package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if (clock < 0 || clock > 23) {
            return false;
        }
        return isBarking && ((clock < 8) || (clock >= 20));
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

       return ((firstAge > 12 || secondAge > 12 || thirdAge > 12) && (firstAge < 20 || secondAge < 20 || thirdAge < 20));
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer) {
            return (temp >= 25 && temp <= 45);
        }
        return(temp >= 25 && temp <= 35);
    }

    public static double area(double width, double height) {
       if(width< 0 || height < 0){
           return -1;
       }
       return width * height;
    }

    public static double area(double radius) {
        if(radius < 0){
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
