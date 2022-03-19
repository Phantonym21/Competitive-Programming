public class InsertionSort{
    public static void main(String[] args){
        int[] a = {9,1,8,2,3,4,7,6};
        int len = a.length;
        int temp;
        for(int i = 1; i<len; i++){
            temp = a[i];
            int j= i-1;
            while( j>=0 && temp<=a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=temp;
        }
        for(int m=0;m<len;m++){
            System.out.print(a[m]+"  ");
        }   
    }
}