/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gprasad.leetcode.algorithms.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author gq6pras
 */
public class LongestSubstringWithoutRepeating {

    public int lengthOfLongestSubstring(String s) {
        if(s==null||s.length()==0)
        {
            return 0;
        }
        boolean[] flags = new boolean[256];
        char[] arr = s.toCharArray();
        int start =0;
        int result =0;
        for (int i = 0; i < arr.length; i++) {
            char temp = arr[i];
           if(flags[temp])
           {
               result = Math.max(result, i-start);
               for(int j = start;j<i;j++)
               {
                   if(arr[j]==temp)
                   {
                       start=j+1;
                       break;
                   }
                   flags[arr[j]] = false;
               }
           }
           else
           {
               flags[temp]=true;
           }
            
        }
       result = Math.max(result, arr.length-start);
        return result;
    }
}
