class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> li=new ArrayList<>();
        Map<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String temp=strs[i];
            char a[]=temp.toCharArray();
            Arrays.sort(a);
            String str=new String(a);
            if(map.containsKey(str)){
                map.get(str).add(temp);
            }else{
                List<String> l=new ArrayList<>();
                l.add(temp);
                map.put(str,l);
            }
        }
        for(List<String> s:map.values()){
            li.add(s);
        }
        return li;
    }
}
