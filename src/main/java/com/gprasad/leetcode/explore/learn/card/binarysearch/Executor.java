package com.gprasad.leetcode.explore.learn.card.binarysearch;

import java.util.Arrays;

public class Executor {
    public static void main(String[] args) {
        /*BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(new int[]{-1,0,3,5,9,12}, 9));*/
        //System.out.println(new Sqrt().mySqrt(2147395599));
        /*System.out.println(new FindMinimumInRotatedSortedArray().findMin(new int[]{2,3,4,5,1}));
        System.out.println(new FindMinimumInRotatedSortedArray().findMin(new int[]{2,1}));*/
//        Arrays.stream(new SearchForARange().searchRange(new int[]{5,7,7,8,8,10}, 8)).forEach(x -> System.out.println(x));
        //System.out.println(new ClosestBinarySearchTreeValue().closestValue(getBST(), 3.714286));

        //System.out.println(new ValidPerfectSquare().isPerfectSquare(808201));
        System.out.println(new FindSmallestLetterGreaterThanTarget().nextGreatestLetter(new char[]{'c','f','j'}, 'j'));

    }

    private static TreeNode getBST(){
        TreeNode lr = new TreeNode(3);
        TreeNode ll = new TreeNode(1);
        TreeNode r = new TreeNode(5);
        TreeNode l = new TreeNode(2,ll,lr);
        return new TreeNode(4, l, r);
    }
}
