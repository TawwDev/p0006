/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Scanner;

public class Validation {

    private Scanner sc = new Scanner(System.in);

    public int getInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.print(msg);
                int n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    return n;
                } else {
                    System.err.println("input need a positive decimal number");
                }
            } catch (NumberFormatException ex) {
                System.err.println("input need a positive decimal number");
            }
        }
    }
}
