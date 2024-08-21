class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int employee=0;
        for(int x:hours)
        {
            if(x>=target)
            {
                employee++;
            }
        }
       return employee; 
    }
}