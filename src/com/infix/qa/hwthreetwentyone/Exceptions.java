package com.infix.qa.hwthreetwentyone;

public class Exceptions {

    private static Object pathname;

    public static void main (String [] args) throws Exception {
        String other;
        int numArray [] = {1, 2, 3, 4};

        String [] Presidents = {"Thomas Jefferson", "George Washington", "Abraham Lincoln", "The Great Trump", "Barack Obama"};
        System.out.println(Presidents [4]);
        try{
            System.out.println(numArray[0]);
            File file =new File(pathname: "E://file.txt");
            FileReader fr= new FileReader(file);
        }catch (Exception exception){
            System.out.println(exception);

        }

//Error: stop code execution
        // Exceptions: handles the exceptions

    }
}
