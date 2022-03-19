class BubbleSort{
    public static void bubble_sort(int[] array){
        for(int i =0; i<array.length;i++){
            for(int j=0; j<array.length-1-i;j++){
                    if(array[j]>=array[j+1]){
                        int temp;
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {3,2,57,34,9,32,6,63,2};
        bubble_sort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}