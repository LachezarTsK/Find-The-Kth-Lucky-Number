
function kthLuckyNumber(k: number): string {
    const LUCKY_DIGITS = ['4', '7'];
    let oneBasedIndexing = k + 1;
    let length = Math.floor(Math.log2(oneBasedIndexing));
    const kthLuckyNumber: string[] = new Array(length);

    for (let i = length - 1; i >= 0; --i) {
        kthLuckyNumber[i] = LUCKY_DIGITS[oneBasedIndexing & 1];
        oneBasedIndexing >>= 1;
    }

    return kthLuckyNumber.join('');
};
