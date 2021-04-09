package com.gprasad.leetcode.algorithms.easy;

public class FibonacciNumber {
    public int fib(int N) {
        if(N<=0) return N;
       int a =0, b=1;
       int counter=1;
       while(counter<N){
            int res = a+b;
            a=b;
            b=res;
            counter++;
       }
       return b;
    }
    public int fibRec(int N) {
        if(N<=1) return N;
        return fib(N-1)+fib(N-2);
    }

    public int fibArr(int N) {
        if(N<=1) return N;
        int[] fibarr= new int[N+1];
        fibarr[0]=0;
        fibarr[1]=1;
        for(int i = 2;i<=N;i++) fibarr[i]=fibarr[i-1]+fibarr[i-2];
        return fibarr[N];
    }
}
