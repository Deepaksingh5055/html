package com.company;
import java.util.Scanner;
public class cwh_82_nested_try_catch {
    public static void main(String[] args) {
        int []marks= new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
        while(flag) {
            System.out.println("Enter the value of index");
            int ind = sc.nextInt();
            try {
                System.out.println("Welcome to video 82");

                try {
                    System.out.println(marks[9]);
                    flag =false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("sorry this index does not exist");
                    System.out.println("Exception in leve 2");
                }
            } catch (Exception e) {
                System.out.println("Exception in level 1");
            }
        }
        System.out.println("Thanks for exit this program");
    }
}