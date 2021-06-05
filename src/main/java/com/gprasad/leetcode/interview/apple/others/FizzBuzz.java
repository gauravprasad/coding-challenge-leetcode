package com.gprasad.leetcode.interview.apple.others;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> results = new ArrayList<>();
        IntStream.rangeClosed(1,n).forEach(num->{
           results.add(num%3==0 && num%5==0?"FizzBuzz":num%3==0?"Fizz":num%5==0?"Buzz":String.valueOf(num));
        });
        return results;
    }
}
