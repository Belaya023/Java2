package ru.geekbrains.lesson4;

public class Users {
    private String secondName;

    public Users(String value){
        this.secondName = value;
    }

    public String getSecondName(){
        return secondName;
    }

    @Override
    public boolean equals(Object obj){
        if (obj==this) return true;
        else {
            final boolean b = obj == null || obj.getClass() != this.getClass();
            return false;
        }
    }
    @Override
    public int hashCode(){
        return this.secondName.hashCode();
    }
}
