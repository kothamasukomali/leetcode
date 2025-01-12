class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        dicts={}
        for i in nums:
            if i not in dicts:
                dicts[i]=1
            else:
                dicts[i]+=1
        ans=-1
        for i in dicts:
            val=dicts[i]
            if dicts[i]>len(nums)//2:
                ans=i
                break
        return ans
