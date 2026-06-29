class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j =0; int i =0;
        while(j<n && i<m){
            if(nums1[i]>nums2[j]){
                shiftByOne(nums1, i);
                nums1[i++] = nums2[j++];
                m++;
            }
            else{
                i++;
            }
        }

        while(j<n){
            nums1[i++] = nums2[j++]; 
        }
    }
    
    private void shiftByOne(int[]arr, int idx){
        for(int i = arr.length-1; i>idx; i--){
            arr[i]= arr[i-1];
        }
    }
}