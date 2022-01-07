package com.codegym;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do{
            System.out.println("Resolve Quadratic Equation:");
            System.out.println("1. Enter parameters a, b, c: ");
            System.out.println("0. Exit");
        }while (choice !=0);
        System.out.println("Enter your choice");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                QuadraticEquation equation = new QuadraticEquation();
                System.out.println("Enter parameters a:");
                equation.setA(sc.nextDouble());
                System.out.println("Enter parameters b:");
                equation.setB(sc.nextDouble());
                System.out.println("Enter parameters c:");
                equation.setC(sc.nextDouble());
                System.out.println(equation.showEquation());
                double delta = equation.getDiscriminant();
                System.out.println("Equation's delta is: " + delta);
                if(delta < 0){
                    System.out.println("Equation has no real root");
                }else if(delta == 0){
                    System.out.println("Equation has one root: "+equation.getRoot1());
                }else{
                    System.out.println("Equation has two root: "+equation.getRoot1() + " and " + equation.getRoot2());
                }
                break;
            case 0:
                System.exit(0);
        }
    }
}
