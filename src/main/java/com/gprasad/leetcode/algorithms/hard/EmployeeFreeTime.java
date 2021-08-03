package com.gprasad.leetcode.algorithms.hard;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/*
759. Employee Free Time
Hard

We are given a list schedule of employees, which represents the working time for each employee.

Each employee has a list of non-overlapping Intervals, and these intervals are in sorted order.

Return the list of finite intervals representing common, positive-length free time for all employees, also in sorted order.

(Even though we are representing Intervals in the form [x, y], the objects inside are Intervals, not lists or arrays. For example, schedule[0][0].start = 1, schedule[0][0].end = 2, and schedule[0][0][0] is not defined).  Also, we wouldn't include intervals like [5, 5] in our answer, as they have zero length.



Example 1:

Input: schedule = [[[1,2],[5,6]],[[1,3]],[[4,10]]]
Output: [[3,4]]
Explanation: There are a total of three employees, and all common
free time intervals would be [-inf, 1], [3, 4], [10, inf].
We discard any intervals that contain inf as they aren't finite.
Example 2:

Input: schedule = [[[1,3],[6,7]],[[2,4]],[[2,5],[9,12]]]
Output: [[5,6],[7,9]]


Constraints:

1 <= schedule.length , schedule[i].length <= 50
0 <= schedule[i].start < schedule[i].end <= 10^8
 */
public class EmployeeFreeTime {
    public List<Interval> employeeFreeTime(List<List<Interval>> schedule) {
        List<Interval> intervals = schedule.stream().flatMap(List::stream).sorted((a, b) -> Integer.compare(a.start, b.start)).collect(Collectors.toList());
        List<Interval> result = new ArrayList<>();
        Interval tmp = intervals.get(0);
        intervals.remove(0);
        for (Interval interval : intervals) {
            if (tmp.end < interval.start) {
                result.add(new Interval(tmp.end, interval.start));
                tmp = interval;
            } else tmp.end = Math.max(tmp.end, interval.end);
        }
        return result;
    }
}
