package com.example.project;

import java.util.Scanner;

public class Cube {
    private static boolean proceed = true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cube Cube = new Cube();

        while (proceed) {
            System.out.println("Enter a move (u, d, r, l, f, b) or q to quit:");
            String input = scanner.nextLine();
            com.example.project.Cube.move(Cube, input);
            Cube.printCube();
        }

        scanner.close();
    }

    private static char[][][] cube = new char[6][3][3];
    private static StringBuilder solutionStack = new StringBuilder();

    // Constructor that initializes the cube with default colors
    public Cube() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cube[0][i][j] = 'W'; // White
                cube[1][i][j] = 'R'; // Red
                cube[2][i][j] = 'B'; // Blue
                cube[3][i][j] = 'O'; // Orange
                cube[4][i][j] = 'G'; // Green
                cube[5][i][j] = 'Y'; // Yellow
            }
        }
    }

    // movements as well
    static void move(Cube Cube, String input) {
        switch (input.toLowerCase()) {
            case "u":
                solutionStack.append("u'");
                Cube.rotateTop();
                break;
            case "d":
                solutionStack.append("d'");
                Cube.rotateTop();
                break;
            case "r":
                solutionStack.append("r'");
                Cube.rotateTop();
                break;
            case "l":
                solutionStack.append("l'");
                Cube.rotateTop();
                break;
            case "f":
                solutionStack.append("f'");
                Cube.rotateTop();
                break;
            case "b":
                solutionStack.append("b'");
                Cube.rotateTop();
                break;
            case "q":
                proceed = false;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }

    private void rotateTop() {
    }

    // Function to print the current state of the cube
    public void printCube() {
        for (int i = 0; i < 3; i++) {
            System.out.print("      ");
            for (int j = 0; j < 3; j++) {
                System.out.print(cube[0][i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(cube[4][i][j] + " ");
            }
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(cube[1][i][j] + " ");
            }
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(cube[2][i][j] + " ");
            }
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(cube);
            }
        }
    }
}
