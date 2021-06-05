/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.easy;

/**
 *
 * @author gq6pras
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {
        while(b!=0)
        {
            int tranform = (a&b)<<1;
            a=a^b;
            b=tranform;
            
        }
        return a;
    }
    public static void main(String[] args) {
        SumOfTwoIntegers ofTwoIntegers = new SumOfTwoIntegers();
        System.out.println(ofTwoIntegers.getSum(2, 3));
    }
}
