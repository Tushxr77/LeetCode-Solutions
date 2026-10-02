class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> count = new HashMap();

        for(int i:arr){
            count.put(i,count.getOrDefault(i,0)+1);
        }

        HashSet<Integer> set = new HashSet<>();

        for(int j:count.values()){
            if(set.contains(j))
            return false;
        
        set.add(j);
    }
    return true;
    }
}
