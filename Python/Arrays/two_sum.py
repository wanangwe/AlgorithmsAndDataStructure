arr = [1, -1, 3, 8, 11, 5, 6]
target = 10


def twoSum(array, target):
    nums = {}

    for i in range(len(array)):
        targetSum = target - array[i]
        if targetSum in nums:
            return [i, nums[targetSum]]
        else:
            nums[array[i]] = i

    return []


result = twoSum(arr, target)
print(result)

