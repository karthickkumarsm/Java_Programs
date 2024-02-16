public class day4 {
public void moveZeros(int[] nums) {
    int i=0,j=0,temp=0;
    while(j<nums.length){
        if(i<nums.length-1 && nums[i]!=0){
            i++;
            j++;
        }
        else if(nums[j]!=0){
            temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;j++;
        }else{
            j++;
        }
        
    }
    for (int num : nums) {
        System.out.print(num + " ");
    }
}
public static void main(String[] args) {
    day4 d=new day4();
    int nums[]={1,0,2,0,3,0,0};
    d.moveZeros(nums);
}
}


//Given an integer array nums,move all 0's to the end of it while maintaining the relative
//orde of the non-zero elements
//eg:0 1 0 2 3 0 => 0 0 1 2 3
//Logic:Two pointer
