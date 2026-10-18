class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] temp=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer> map1=new HashMap<>();
        int a=1;
        for(int i=0;i<temp.length;i++){
            if(!map1.containsKey(temp[i])){
            map1.put(temp[i],a);
            a++;
        }
        }
        for(int i=0;i<arr.length;i++){
            temp[i]=map1.get(arr[i]);
        }
        return temp;
    }
}