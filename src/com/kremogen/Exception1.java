package com.kremogen;

import java.util.Scanner;

public class Exception1 {
    public void exceptionDemo(){
        Scanner myScanner = new Scanner( System.in );
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString); System.out.println( 2 / i );

    }
}
