class Solution:
    def decodeMessage(self, key: str, message: str) -> str:
        dicts={}
        temp=97
        for i in key:
            if i!=" " and i not in dicts:
                dicts[i]=chr(temp)
                temp+=1
        ans=""
        for i in message:
            if i==" ":
                ans+=" "
            else:
                ans+=dicts[i]
        return ans

        