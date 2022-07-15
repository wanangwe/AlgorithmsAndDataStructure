import java.util.HashMap;
class TwoSum {
    

    public static void main(String[] args) {

		int[] array = {1,4,8,5,9,-1,6,7,11};
		int target = 10;

		int[] result = twoSum(array,target);

		display(result);
    }

    public static void display(int[] array) {
        

	System.out.print("[");

	for(int i : array) {
		
		System.out.printf("%d, ", i);
		
	}

	System.out.print("]");

	System.out.println();

   }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numMap = new HashMap<Integer,Integer>();
         int result[] = new int[2];
        for(int i =0; i<nums.length; ++i){
           
            if(numMap.containsKey(target - nums[i])){
                result[0] = numMap.get(target - nums[i]);
                result[1] = i;
               
            }
                
            
                numMap.put(nums[i],i);
        }
        return result;
    }
}
