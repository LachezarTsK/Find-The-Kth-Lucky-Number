
#include <array>
#include <string>
using namespace std;

class Solution {

    static constexpr array<char, 2> LUCKY_DIGITS = { '4', '7' };

public:
    string kthLuckyNumber(int k)const {
        int oneBasedIndexing = k + 1;
        int length = log2(oneBasedIndexing);
        string kthLuckyNumber(length, ' ');

        for (int i = length - 1; i >= 0; --i) {
            kthLuckyNumber[i] = LUCKY_DIGITS[oneBasedIndexing & 1];
            oneBasedIndexing >>= 1;
        }

        return kthLuckyNumber;
    }
};
