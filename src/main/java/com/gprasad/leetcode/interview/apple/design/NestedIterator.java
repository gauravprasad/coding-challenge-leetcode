package com.gprasad.leetcode.interview.apple.design;

import java.util.*;

public class NestedIterator implements Iterator<Integer> {
    private List<Integer> list = new ArrayList<>();
    private int pos = 0;

    public NestedIterator(List<NestedInteger> nestedList) {
        initialize(nestedList);
    }

    private void initialize(List<NestedInteger> nestedList) {
        for (NestedInteger integer : nestedList) {
            if (integer.isInteger()) list.add(integer.getInteger());
            else initialize(integer.getList());
        }
    }

    @Override
    public boolean hasNext() {
        return pos < list.size();
    }

    @Override
    public Integer next() {
        if (!hasNext()) new NoSuchElementException();
        return list.get(pos++);
    }
}
