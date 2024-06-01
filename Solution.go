
package main

import (
	"fmt"
	"math"
)

func kthLuckyNumber(k int) string {
	var LUCKY_DIGITS = [2]byte{'4', '7'}
	var oneBasedIndexing = k + 1

	var length = int(math.Log2(float64(oneBasedIndexing)))
	var kthLuckyNumber = make([]byte, length)

	for i := length - 1; i >= 0; i-- {
		kthLuckyNumber[i] = LUCKY_DIGITS[oneBasedIndexing&1]
		oneBasedIndexing = oneBasedIndexing >> 1
	}

	return string(kthLuckyNumber)
}
