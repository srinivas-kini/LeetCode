# https://leetcode.com/problems/complex-number-multiplication/submissions/
class Solution:
    def complexNumberMultiply(self, num1, num2):

        (re1, im1) = (int(num1.split("+")[0]), int(num1.split("+")[1].replace("i", "")))
        (re2, im2) = (int(num2.split("+")[0]), int(num2.split("+")[1].replace("i", "")))
        re = str((re1 * re2) + -(im1 * im2))
        im = str((re1 * im2) + (im1 * re2)) + "i"
        return f"0+{im}" if re == "0" else f"{re}+{im}"


