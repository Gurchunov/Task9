package com.company.teachmeskills;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/company/teachmeskills/input.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/company/teachmeskills/output.txt"));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                bufferedWriter.write(s+"\n");
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}