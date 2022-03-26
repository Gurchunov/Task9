package com.company.teachmeskills;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("src/com/company/teachmeskills/input.txt"));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/com/company/teachmeskills/output.txt"));
            BufferedWriter bufferedWriterError = new BufferedWriter(new FileWriter("src/com/company/teachmeskills/error.txt"));
            String s;
            String docnum = "docnum";
            String contract = "contract";
            while ((s = bufferedReader.readLine()) != null) {
                if (s.length() <= 15 && s.startsWith(docnum) || s.startsWith(contract)) {
                    bufferedWriter.write(s + " " + InvalidInfo.VALID + "\n");
                    bufferedWriter.flush();
                } else {
                    bufferedWriterError.write(s + " " + InvalidInfo.INVALID + "\n");
                    bufferedWriterError.flush();
                }
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}