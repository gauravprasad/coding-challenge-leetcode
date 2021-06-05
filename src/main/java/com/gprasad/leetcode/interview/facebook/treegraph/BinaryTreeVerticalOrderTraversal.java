package com.gprasad.leetcode.interview.facebook.treegraph;

import org.w3c.dom.ranges.Range;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinaryTreeVerticalOrderTraversal {
    class Pair<K, V> {
        K key;
        V value;

        Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public List<List<Integer>> verticalOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();
        Map<Integer, List<Integer>> verticalTraversalMap = new HashMap<>();
        int minCol = 0;
        int maxCol = 0;
        Queue<Pair<TreeNode, Integer>> q = new LinkedList<>();
        Integer col = 0;
        q.offer(new Pair<>(root, col));
        while (!q.isEmpty()) {
            Pair<TreeNode, Integer> p = q.poll();
            if (p.key != null) {
                verticalTraversalMap.putIfAbsent(p.value, new ArrayList<>());
                verticalTraversalMap.get(p.value).add(p.key.val);
                minCol = Math.min(minCol, p.value);
                maxCol = Math.max(maxCol, p.value);
                q.offer(new Pair<>(p.key.left, p.value - 1));
                q.offer(new Pair<>(p.key.right, p.value + 1));
            }

        }
        return IntStream.rangeClosed(minCol,maxCol).boxed().map(k->verticalTraversalMap.get(k)).collect(Collectors.toList());
    }

}
//[[-4,78,-77,73,-54,-36],[12,-51,-81,4,8,-30,3,-33,24,81,98,86],[-64,-53,-31,47,-35,-67,-37,72,-4,-38,-31,-31,-18,-72,-66,43],[18,-93,-51,33,-38,-11,-24,47,-91,80,44,-42,-40,70,-93],[76,3,-64,26,-31,-19,10,-96,-85,67,34,-92,-1],[3,-60,-44,-59,12,-51,67,-88,48,-26,92,72],[53,-81,27,60,-70,-55,-88,72,56,-98,-84],[11,-49,-90,90,-34,-67,-27,98],[74,17,-65,-17,-53,39],[37]]
//[[-4,78,73,-77,-54,-36],[12,-51,-81,4,8,3,-30,-33,86,81,98,24],[-64,-53,-31,47,-35,-67,-37,72,-4,-38,-31,-31,-18,-66,-72,43],[18,-93,33,-51,-38,47,-24,-11,80,44,-91,-42,-40,70,-93],[76,3,-64,26,-31,-19,10,-85,-96,67,34,-92,-1],[3,-44,-60,12,-59,-51,67,-88,48,-26,92,72],[53,-81,27,60,-55,-70,72,56,-88,-98,-84],[11,-49,-90,90,-34,-27,-67,98],[74,17,-17,-65,-53,39],[37]]


//[-64,12,18,-4,-53,null,76,null,-51,null,null,-93,3,null,-31,47,null,3,53,-81,33,4,null,-51,-44,-60,11,null,null,null,null,78,null,-35,-64,26,-81,-31,27,60,74,null,null,8,-38,47,12,-24,null,-59,-49,-11,-51,67,null,null,null,null,null,null,null,-67,null,-37,-19,10,-55,72,null,null,null,-70,17,-4,null,null,null,null,null,null,null,3,80,44,-88,-91,null,48,-90,-30,null,null,90,-34,37,null,null,73,-38,-31,-85,-31,-96,null,null,-18,67,34,72,null,-17,-77,null,56,-65,-88,-53,null,null,null,-33,86,null,81,-42,null,null,98,-40,70,-26,24,null,null,null,null,92,72,-27,null,null,null,null,null,null,-67,null,null,null,null,null,null,null,-54,-66,-36,null,-72,null,null,43,null,null,null,-92,-1,-98,null,null,null,null,null,null,null,39,-84,null,null,null,null,null,null,null,null,null,null,null,null,null,-93,null,null,null,98]
//[[-4,78,-77,-54,-36,73],[12,-51,-81,4,8,-30,-33,86,81,98,24,3],[-64,-31,-53,47,-35,-67,-37,-4,-66,-31,-72,-31,43,-18,72,-38],[18,-51,-93,33,-38,47,-24,-42,44,-40,70,-93,-91,80,-11],[76,3,-64,10,-19,-31,-92,-1,-85,67,34,-96,26],[3,-60,67,-59,-44,-88,72,-26,12,48,-51,92],[53,-81,56,-70,27,72,-84,-98,-88,-55,60],[11,-49,-34,-90,90,-27,-67,98],[74,-65,17,39,-53,-17],[37]]
//[[-4,78,73,-77,-54,-36],[12,-51,-81,4,8,3,-30,-33,86,81,98,24],[-64,-53,-31,47,-35,-67,-37,72,-4,-38,-31,-31,-18,-66,-72,43],[18,-93,33,-51,-38,47,-24,-11,80,44,-91,-42,-40,70,-93],[76,3,-64,26,-31,-19,10,-85,-96,67,34,-92,-1],[3,-44,-60,12,-59,-51,67,-88,48,-26,92,72],[53,-81,27,60,-55,-70,72,56,-88,-98,-84],[11,-49,-90,90,-34,-27,-67,98],[74,17,-17,-65,-53,39],[37]]