def removeDuplicates(nums:list):
    if len(nums) == 0:
        return 0

    i = 0
    j = 0
    for _ in range(len(nums)):
        if nums[j] != nums[i]:
            i += 1
            nums[i] = nums[j]
        j += 1
    return i+1

nums = [0,0,1,1,1,2,3,4,4,5,5,6,6,7,7,7,7]
ans = removeDuplicates(nums)
for i in range(ans):
    print(nums[i])
