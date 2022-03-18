public class BinarySearch {
    public static void BinarySearch(int[] a,int x){
        binary_search(a, x, 0, a.length-1);
    }
    public static void binary_search(int[] a, int x, int start, int end){
        if(start == end){
            System.out.println("Element not present");
            return;
        }
        int s = start;
        int e = end;
        int mid = (start+end)/2;
        if(a[mid]==x){
            System.out.println("Element present at index " + mid );
            return;
        }else if(a[mid]>x){
            e = mid-1;
        }else{
            s = mid +1;
        }
        binary_search(a,x,s,e);

    }
    public static void main(String[] args){
        int[] arr = {1,6,8,10,56,324,2043,4240,8767,45345};
        BinarySearch(arr,324);
    }
}
