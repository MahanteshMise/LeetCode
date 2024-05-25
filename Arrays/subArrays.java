public class AllSubString {
    public void printSubStrings(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]);
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args){
        int [] arr = {1,2,3,4,5,6,7,8};
        AllSubString obj = new AllSubString();
        obj.printSubStrings(arr);
    }
}