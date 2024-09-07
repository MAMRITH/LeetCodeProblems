class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        List<Integer>list=new ArrayList<Integer>();
        List<Integer>list2=new ArrayList<Integer>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(list.contains(arr[i]))
            {
                continue;
            }
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;

                }
            }
            if(list2.contains(count))
            {
                return false;
            }
            else
            {
                list2.add(count);
                list.add(arr[i]);
                count=0;
            }
        }

     return true;   
    }
}