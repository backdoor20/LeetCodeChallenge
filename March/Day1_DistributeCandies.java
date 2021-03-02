class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int a:candyType)
            set.add(a);
        int len=candyType.length;
        int size=set.size();
        if(len/2<size)
            return len/2;
        else
            return size;
    }
}