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
public class StringtoInteger {
    public int myAtoi(String str) {
        long strNumber = 0l;
        try{
            strNumber = Long.valueOf(str.trim());
        }catch(NumberFormatException ex)
        {
            strNumber = 0l;
        }
        if(strNumber != (int)strNumber)
        {
            strNumber = 0l;
        }
        return (int)strNumber;
    }
}
