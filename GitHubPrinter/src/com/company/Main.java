package com.company;

public class Main {

    public static void main(String[] args) {


        // hi this application represent a double sided printer machine
        // you are able to check toner level or amount and also page count



        Printer printer = new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("Initial page count " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +
                        " new total count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +
                " new total count for printer = " + printer.getPagesPrinted());

















    }
}
