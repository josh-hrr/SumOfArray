class Main {
  public static void main(String[] args) { 
  
    int[] arrayTest = {1,2,3,4};

    System.out.println(runningSum(arrayTest));
  }

  public static int[] runningSum(int[] nums) {   
        for(int i = 1; i<nums.length; i++){
            nums[i] = nums[i] + nums[i - 1];
        }  
    return nums;
    }
}