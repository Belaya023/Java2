package ru.geekbrains.lesson4;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private HashMap<String, String> phoneBook = new HashMap<>();

    public void add(String tel, String secondName){
        phoneBook.put(tel, secondName);
    }

    public void info(){
        for(Map.Entry<String, String> entry : phoneBook.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public String get(String secondName){
        String b = "Not found";
        String a = "";
        for(Map.Entry<String, String> entry : phoneBook.entrySet()){
            if (secondName.equals(entry.getValue())){
                a += (entry.getKey() + " - " + entry.getValue() + "\n");
            }
        }
        if (a != ""){
            return a;
        }else{
            return b;
        }

    }


}
