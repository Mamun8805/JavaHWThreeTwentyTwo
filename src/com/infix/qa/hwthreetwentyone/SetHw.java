package com.infix.qa.hwthreetwentyone;

import java.util.HashSet;
import java.util.Iterator;

public class SetHw {
    public static void main (String [] args){
        HashSet<String> nameset = new HashSet <~>;

        nameset.add ("Michael Jordan");
        nameset.add ("Stephen Curry");
        nameset.add ("Kevin Durrant");
        nameset.add ("Kobe Bryant");
        nameset.add ("Lebron James");
        nameset.add("Michael Jordan";

        nameset.remove ( o: "Michael Jordan");
        //nameset.clear();
        //System.out.println(nameset.contains("Michael Jordan"));
        //System.out.println(nameset.size());

        /* try {
              nameset.add("Michael Jordan" +"Stephen Curry" + "Kevin Durrant" + "Kobe Bryant" + "Lebron James");
              System.out.println("Michael Jordan");
          } catch{Exception) {
            System.out.println("Please Enter Right Name");

         } */
        Iterator <String> it =nameset.iterator();
        while (it.hashNext()){
            System.out.println(it.next());

        }
    }
}