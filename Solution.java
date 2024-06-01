
public class Solution {

    private static final char[] LUCKY_DIGITS = {'4', '7'};

    public String kthLuckyNumber(int k) {
        int oneBasedIndexing = k + 1;
        // Since Java does not have Math.log2, as of 01-June-2024, we do as follows:
        // Math.log(oneBasedIndexing) / Math.log(2), which equals log2(oneBasedIndexing)
        int length = (int) (Math.log(oneBasedIndexing) / Math.log(2));
        char[] kthLuckyNumber = new char[length];

        for (int i = length - 1; i >= 0; --i) {
            kthLuckyNumber[i] = LUCKY_DIGITS[oneBasedIndexing & 1];
            oneBasedIndexing >>= 1;
        }

        return String.valueOf(kthLuckyNumber);
    }
}
