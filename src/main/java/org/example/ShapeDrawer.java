package org.example;

import java.util.Scanner;

public class ShapeDrawer {
    Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ShapeDrawer shapeDrawer = new ShapeDrawer();
        shapeDrawer.run();
    }

    /* These methods are used for print all the menus
     * */
    public void displayMenu() {
        System.out.println("Welcome to ASCII Shape Drawer!\n");
        System.out.println("Choose a shape to draw:");
        System.out.println("1. Triangle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.println("4. Exit\n");
    }

    /*
     * These method is used for print an Isosceles Triangle
     * */
    public void drawIsoscelesTriangle(int height) {

        for(int i = 1; i <= height; i++){
            for(int k = height - i; k > 0; k--){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2 * i -1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
     * These method is used for print a Right Triangle
     * */
    public void drawRightTriangle(int height) {
        for (int r = 1; r <= height; r++) {
            for (int j = 1; j <= r; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* These method is used for print a Square
     * */
    public void drawSquare(int width) {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    /* These method is used for print a Rectangle
     * */
    public void drawRectangle(int width, int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void drawShape(int choice) {
        switch (choice) {
            case 1:
                System.out.println("1. Segitiga Siku-Siku");
                System.out.println("2. Segitiga Sama Kaki");
                System.out.print("Please choose which triangle do you want: ");
                int response = input.nextInt();
                if (response == 1) {
                    System.out.print("Masukkan panjang segitiga siku-siku: ");
                    int height = input.nextInt();
                    drawRightTriangle(height);
                    break;
                } else if (response == 2) {
                    System.out.print("Masukkan panjang segitiga sama kaki: ");
                    int height2 = input.nextInt();
                    drawIsoscelesTriangle(height2);
                    break;
                } else {
                    System.out.println("Invalid input");
                }

            case 2:
                System.out.print("Please input the width of the Square: ");
                int width = input.nextInt();
                drawSquare(width);
                break;

            case 3:
                System.out.print("Please input the width of the Rectangle: ");
                int widthRec = input.nextInt();
                System.out.print("Please input the height of the Rectangle: ");
                int heightRec = input.nextInt();
                drawRectangle(widthRec, heightRec);
                break;

            case 4:
                System.exit(0);
                break;

            default:
                System.out.println("Invalid input");
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            drawShape(choice);
        }
    }

}