package com.company;

public class CtoFTableDisplay {

    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit");
        for(int i=-100;i<=100;i++)
        {
            double temp=CtoF(i);
            System.out.format(i+"\t\t %.2f\n",temp);
        }
    }

    public static double CtoF(double Celsius)
    {
        return Celsius*9/5 + 32;
    }
}
