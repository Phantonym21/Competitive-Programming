// import java.util.ArrayList;

public class SelectionSort{
    // static void swap(int x, int y){
    //     int t;
    //     t=x;
    //     x=y;
    //     y=t;

    // }
    public static void main(String[] args){
        int[] a = {9,1,8,2,3,4,7,6};
        int temp;
        
        int len = a.length;
        int min =0;
        int i=0;
        while(i<len){
            // int min=0;
            int j=i;
            while(j<len){
                if(a[j]<=a[min]){
                    min=j;
                    j++;
                }
                else{
                    j++;
                }
            }
            
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
            
            System.out.println(a[min]);
            System.out.println(a[i]);
            for(int m=0;m<len;m++){
                System.out.print(a[m]+"  ");
            }
            System.out.println(" ");
            i++;
        }
       
    }   
}