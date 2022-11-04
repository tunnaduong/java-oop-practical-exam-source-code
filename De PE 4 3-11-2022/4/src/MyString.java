/*
 * Copyright 2022 (C) Tunna Duong. All parts of this code is made
 * possible by my own hand and a little support from Google :D
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tunna Duong
 */
public class MyString implements IString {

    @Override
    public int sum(String string) {
        Scanner sc = new Scanner(string);
        String delim = "[\\s]+";
        sc.useDelimiter(delim);
        // Get the largest number from the sequences of string numbers
        int largest = 0;
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                largest = sc.nextInt();
            } else {
                return 0;
            }
        }
        // Performing sum calculation with the number found
        int sum = 0;
        int old;
        // Deep cloning the old scanner for the next job:
        // "Calculate sum"
        Scanner sc2 = new Scanner(string);
        sc2.useDelimiter(delim);
        while(sc2.hasNext()) {
            if (sc2.hasNextInt()) {
                old = sc2.nextInt();
                if (old > largest) {
                    sum += old;
                }
            } else {
                break;
            }
        }
        return sum;
    }

    @Override
    public String getCode(String string) {
        String[] tok = string.split("[\\s]+");
        ArrayList<String> arr = new ArrayList<String>();
        for (String str : tok) {
            StringBuffer sBuf = new StringBuffer("");
            boolean shouldAddNew = true;
            for (char c : str.toCharArray()) {
                if (!Character.isAlphabetic(c)) {
                    shouldAddNew = false;
                    break;
                }
                sBuf.append(Character.toString(c));
            }
            if (shouldAddNew) {
                arr.add(sBuf.toString());
            }
        }
        StringBuffer ret = new StringBuffer("");
        for (int i = arr.size() - 1; i >= 0; i--) {
            ret.append(arr.get(i).toString()+" ");
        }
        return ret.toString().trim();
    }
    
}
