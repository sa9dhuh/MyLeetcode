class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int b = nums2.length;

        int[] arr = new int[n+b];

        int k = 0;

        for(int i=0; i<n; i++) {
            arr[k++] = nums1[i];
        }

        for(int i=0; i<b; i++) {
            arr[k++] = nums2[i];
        }

        java.util.Arrays.sort(arr);

        int mid1 = arr.length/2 - 1;
        int mid2 = arr.length/2;

        if(arr.length % 2 == 0) {
            return (arr[mid1] + arr[mid2]) / 2.0;
        }
        else {
            return arr[mid2];
        }
    }
}