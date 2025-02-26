package leetcode.two_sum

class TwoSumSolution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mapOfCorrectTwoSumsOfTarget = mutableMapOf<Int, Int>()

        for (i in nums.indices) {
            val completion = target - nums[i]

            if (mapOfCorrectTwoSumsOfTarget.containsKey(completion)) {
                return intArrayOf(mapOfCorrectTwoSumsOfTarget[completion]!!, i)
            }

            mapOfCorrectTwoSumsOfTarget[nums[i]] = i
        }
        throw IllegalArgumentException("Not added two elements up to the target ")
    }
}