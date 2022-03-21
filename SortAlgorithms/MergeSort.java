// import java.util.*;

public class MergeSort{
    public static void merge_sort(int[] array){
        mergesort(array,new int[array.length], 0, array.length-1);
    }
    public static void mergesort(int[] arr,int[] temp,int leftStart,int rightEnd){
        if(leftStart>= rightEnd){
            return;
        }
        int mid = (leftStart + rightEnd)/2;
        
        mergesort(arr,temp,leftStart,mid);
        mergesort(arr,temp,mid+1,rightEnd);
        mergeHalves(arr,temp,leftStart,rightEnd);
        
    }

    public static void mergeHalves(int arr[],int[] t,int LeftStart,int RightEnd){
        int LeftEnd = (LeftStart+RightEnd)/2;
        int RightStart = LeftEnd + 1;
        int size = RightEnd - LeftStart + 1;
        
        int left = LeftStart;
        int right = RightStart;
        int index = LeftStart;
        
        while(left<=LeftEnd && right <= RightEnd){
            if(arr[left]<=arr[right]){
                t[index] = arr[left];
                left++;
            }
            else{
                t[index] = arr[right];
                right++;
            }
            index++;
        }
        

        System.arraycopy(arr,left,t, index,LeftEnd - left +1);
        System.arraycopy(arr,right,t, index,RightEnd - right +1);
        System.arraycopy(t,LeftStart,arr, LeftStart,size);
        
    }
    public static void main(String[] args){
        int[] a = {5,3,2,6,4,1,3,9};
        merge_sort(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
