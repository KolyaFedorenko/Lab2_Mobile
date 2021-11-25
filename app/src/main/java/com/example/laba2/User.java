package com.example.laba2;

public class User
{
    String FIO;
    int age;
    String Height;
    String Weight;
    String ColorHair;
    String Gender;
    public User(String FIO, int age ,String Height, String Weight,   String ColorHair, String Gender)
    {
        this.FIO = FIO;
        this.age = age;
        this.ColorHair = ColorHair;
        this.Gender = Gender;
        this.Height = Height;
        this.Weight = Weight;
    }
    public String getFIO() {
        return this.FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public int getage() {
        return this.age;
    }

    public void setage(int age) {
        this.age = age;
    }
    public String getColorHair() {
        return this.ColorHair;
    }

    public void setColorHair(String ColorHair) {
        this.ColorHair = ColorHair;
    }
    public String getGender() {
        return this.Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public String getHeigth() {
        return this.Height;
    }

    public void setHeight(String Heigth) {
        this.Height = Heigth;
    }
    public String getWeight() {
        return this.Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }


}
