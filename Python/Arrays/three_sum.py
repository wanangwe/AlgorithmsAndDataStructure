def three_sum(nums, target):
    nums.sort()
    triplets = []
    unique_triplets = []

    for i in range(len(nums) - 2):
        left = i + 1
        right = len(nums) - 1

        while left < right:
            current_sum = nums[i] + nums[left] + nums[right]

            if current_sum == 0:
                temp = str(nums[i]) + ":" + str(nums[left]) + ":" + str(nums[right])

                if temp not in unique_triplets:
                    unique_triplets.append(temp)
                    triplets.append([nums[i], nums[left], nums[right]])
                left += 1
                right -= 1


            elif current_sum < 0:
                left += 1

            else:
                right -= 1

    return triplets


nums = [-1, 0, 1, 2, -1, -4]
t = 0
result = three_sum(nums, t)
print(result)
