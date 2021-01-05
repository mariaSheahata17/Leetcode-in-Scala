object Solution {
    def moveZeroes(nums: Array[Int]): Unit = {
        var target: Int = 0
        var targetCount: Int = 0
        
        for(i <- nums.indices){
            if(nums(i)==target){
                targetCount = targetCount + 1
                
            }else if (targetCount > 0){
                nums(i - targetCount) = nums(i)
            }
        }
        
        // setting zeros at the end of the array
        for(i <- nums.length - targetCount until nums.length){
            nums(i) = target
        }
        
    }
}