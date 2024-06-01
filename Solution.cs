
using System;

public class Solution
{
    private static readonly char[] LUCKY_DIGITS = { '4', '7' };

    public string KthLuckyNumber(int k)
    {
        int oneBasedIndexing = k + 1;
        int length = (int)Math.Log2(oneBasedIndexing);
        char[] kthLuckyNumber = new char[length];

        for (int i = length - 1; i >= 0; --i)
        {
            kthLuckyNumber[i] = LUCKY_DIGITS[oneBasedIndexing & 1];
            oneBasedIndexing >>= 1;
        }

        return string.Join("", kthLuckyNumber);
    }
}
