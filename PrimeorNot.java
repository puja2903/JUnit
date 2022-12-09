package com.demo.test;

import java.util.Scanner;

public class PrimeorNot {
public static boolean prime(int a) {
		
	 for (int i = 2; i < a; i++)
        if (a % i == 0) {
            return false;
}
    return true;
}
}
