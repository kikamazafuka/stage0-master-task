package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int res = 0;
        while (number>0){
            int digit = number%10;
            res = res*10+digit;
            number/=10;
        }
        System.out.println(res);
    }
}
