public class day5 {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13};
        int gap=3;
        int output_count=3;
        if(gap<arr.length){
            if (output_count<arr.length) {
                for(int i=0;i<output_count;i++){
                    int total=0;
                    for(int j=i;j<arr.length;j=j+gap){
                        total=total+arr[j];
                    }
                    System.out.println(total);
                }
            }
            else{
                System.out.println("Output value should be less than array length");
            }
        }
        else{
            System.out.println("Output value should be less than array length");
        }
    }
}
