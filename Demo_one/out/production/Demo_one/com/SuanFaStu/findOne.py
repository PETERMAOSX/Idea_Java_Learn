def findOne(nums:list):
    ans = -1
    if len(nums) == 0:
        return -1
    for i in nums:
        if nums.count(i) == 1:
            ans = i
    return ans
def FindOnePro(nums:list) -> int:
    if len(nums) == 0:
        return -1
    dict_map = {}
    for i in nums:
        count = dict_map.get(i)
        temp = 0
        if count == None:
            temp = 1
        else:
            temp = count + 1
        #count = 1 if count == None else count = count + 1
        count = temp
        dict_map[i] = count
    for i in nums:
        count = dict_map.get(i)
        if count == 1:
            return i
    return -1

nums = [1,1,2,2,3,3,4]
print(FindOnePro(nums))
