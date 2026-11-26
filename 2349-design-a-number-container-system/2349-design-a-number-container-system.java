
import java.util.*;

class NumberContainers {

    TreeMap<Integer, Integer> map;
    TreeMap<Integer, PriorityQueue<Integer>> nums;

    public NumberContainers() {
        map = new TreeMap<>();
        nums = new TreeMap<>();
    }

    public void change(int index, int number) {

        map.put(index, number);

        nums.putIfAbsent(number, new PriorityQueue<>());
        nums.get(number).add(index);
    }

    public int find(int number) {

        if(!nums.containsKey(number)) {
            return -1;
        }

        PriorityQueue<Integer> pq = nums.get(number);

        while(!pq.isEmpty() && !map.get(pq.peek()).equals(number)) {
            pq.poll();
        }

        if(pq.isEmpty()) {
            return -1;
        }

        return pq.peek();
    }
}
