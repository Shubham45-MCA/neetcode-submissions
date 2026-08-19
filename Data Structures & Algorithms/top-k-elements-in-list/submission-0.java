class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer,Integer> map=new HashMap<>();
       for(int x:nums){
        map.put(x,map.getOrDefault(x,0)+1);
       }
       List<Integer> bucket[]=new List[nums.length+1];
       for(int i=0;i<bucket.length;i++){
        bucket[i]=new ArrayList<>();
       }
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        int ke=entry.getKey();
        int freq=entry.getValue();
        bucket[freq].add(ke);
       }
       int result[]=new int[k];
       int idx=0;
       for(int i=bucket.length-1;i>=0;i--){
        for(int x:bucket[i]){
            result[idx]=x;
            idx++;
            if(idx==k) return result;
        }
       }
       return result;
    }
}
