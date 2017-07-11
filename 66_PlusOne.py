class Solution(object):
    def plusOne(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        carry = 0
        newList = []

        if (len(digits) == 1):
            if digits[0] == 9:
                return [1,0]
            else:
                digits[0] = digits[0]+1
                return digits

        curDigit = digits[len(digits)-1]
        if (curDigit + 1 > 9):
            carry = 1
            digits[len(digits)-1] = 0
        else:
            digits[len(digits)-1] = curDigit + 1
            return digits

        for x in xrange(0, len(digits)-2):
            curDigit = digits[len(digits)-2-x]
            if carry > 0:
                if curDigit + 1 > 9:
                    curDigit = 0
                else:
                    curDigit += 1
                    carry = 0
            else:
                break

            print curDigit
            digits[len(digits)-2-x] = curDigit

        if (carry > 0):

            if digits[0] == 9:
                digits[0] = 0
            else:
                digits[0] += 1
                carry = 0
        if carry > 0:
            newList = [1] + digits
        else:
            newList = digits

        return newList


