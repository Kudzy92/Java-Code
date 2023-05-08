package app.kudzy.service;

import java.util.Scanner;

public class PrintManager {
    public void printLine() {
        System.out.println("========================================================================");
    }
    public void printMessage(String msg){
        System.out.println(msg);
    }
    public String readInput(){
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }



}
