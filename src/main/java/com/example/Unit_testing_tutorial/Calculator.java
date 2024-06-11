package com.example.Unit_testing_tutorial;

public class Calculator {

    public int add(int x, int y){
        return x + y;
    }

    public int substract(int x, int y){
        return x - y;
    }
    public int multiply(int x, int y){
        return x * y;
    }

    public int SumOfMultipleNo(int ...numbers){

        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}
