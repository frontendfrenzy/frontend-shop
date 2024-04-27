public class sorted{
    public static void main(String[] args){
        int arr[] ={1,3,6,5,2,4};
        System.out.println("Original array:");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");

        int temp = 0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                temp = arr[i];
                arr[i] = arr[j]; 
                arr[j] = temp;
               }
            }
        }
        System.out.println("Sorting array:");
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]+" ");
    }
    
}
