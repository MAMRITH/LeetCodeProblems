class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        //Set<Integer>set1=new HashSet<Integer>();
        //Set<Integer>set2=new HashSet<Integer>();
        List<Integer>list1=new ArrayList<Integer>();
        List<Integer>list2=new ArrayList<Integer>();
        boolean f=true;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    f=false;
                    break;
                }
            }
            if(f==true)
            {
                if(list1.contains(nums1[i]))
                {
                    continue;
                }
                else
                {
                    list1.add(nums1[i]);
                }
            }
            else
            {
                f=true;
            }
        }
        f=true;
        for(int k=0;k<nums2.length;k++)
        {
            for(int l=0;l<nums1.length;l++)
            {
                if(nums2[k]==nums1[l])
                {
                    f=false;
                    break;
                }
            }
            if(f==true)
            {
                if(list2.contains(nums2[k]))
                {
                    continue;
                }
                list2.add(nums2[k]);
            }
            else
            {
                f=true;
            }
        }
   
    
     result.add(list1);
     result.add(list2);
     return result;   
    }
}