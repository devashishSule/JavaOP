public class sortingArray {
    public static void main(String[] args) {
        int [] arr = new int[] {5,6,2,1,8,4,3};
        int i,j;
        int temp = 0;
        
        System.out.println("Array Sorting...");
        System.out.print("Given Array: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // sorting arr in ascending order
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

         // printing the sorted arr
         System.out.print("Array in ascending order: ");
         for(i=0;i<arr.length;i++){
             System.out.print(arr[i] + " ");
         }

        // sorting arr in descending order
        for(i=0;i<arr.length;i++){
            for(j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println();
        
       // printing the sorted arr
        System.out.print("Array in descending order: ");
        for(i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
