
import kotlin.math.log

class Solution {

    private companion object {
        var LUCKY_DIGITS = charArrayOf('4', '7')
    }

    fun kthLuckyNumber(k: Int): String {
        var oneBasedIndexing = k + 1;

        val length = log(oneBasedIndexing.toDouble(), 2.0).toInt()
        val kthLuckyNumber = CharArray(length);

        for (i in length - 1 downTo 0) {
            kthLuckyNumber[i] = LUCKY_DIGITS[oneBasedIndexing and 1]
            oneBasedIndexing = oneBasedIndexing shr 1
        }

        return kthLuckyNumber.joinToString("")
    }
}
