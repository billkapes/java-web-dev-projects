package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        //System.out.println(Divide(6,3));


        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.js");

        // Test out your CheckFileExtension() function!
        System.out.println(CheckFileExtension(studentFiles.get("Carl")));
        System.out.println(CheckFileExtension(studentFiles.get("Brad")));
        System.out.println(CheckFileExtension(studentFiles.get("Elizabeth")));
        System.out.println(CheckFileExtension(studentFiles.get("Stefanie")));

    }

    public static int Divide(int x, int y)
    {
        if (y == 0) {
            try {
                throw new ArithmeticException("Cannot divide by zero.");
            } catch (ArithmeticException e) {
                e.printStackTrace();
                return 0;
            }
        }
        return x / y;
    }

    public static int CheckFileExtension(String fileName)
    {
        if (fileName == null || fileName.isEmpty() || fileName.length() < 5) {
            try {
                throw new Exception("Filename is null or empty or too short.");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
        String extension = fileName.substring(fileName.length() - 5);
        if (extension.equals(".java")) {
            return  1;
        } else {
            return  0;
        }

    }
}