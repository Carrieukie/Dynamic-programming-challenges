/**
 * This refused to work in java, if you know how make a PR and push a java solution
 * @param target
 * @param wordBank
 * @returns {*[][]|[]}
 */
const allConstruct  = (target,wordBank,memo={}) => {

    if (target === '') return [[]]
    if (target in memo) return memo[target]

    const result = []

    for (let word of wordBank){
        if (target.indexOf(word) === 0){
            const suffix = target.slice(word.length)
            const suffixWays = allConstruct(suffix,wordBank,memo)
            const targetWays = suffixWays.map(way => [word, ...way])
            result.push(...targetWays)
        }
    }
    memo[target] = result
    return result;
}

console.log(allConstruct("purple",['pur','pl','purp','le','ple']))
console.log(allConstruct("skateboard",['bo','rd','ate','te','ska','sk','boar','a']))
console.log(allConstruct("abcdef",['abc','cd','def','abcd','ef','ab']))
console.log(allConstruct("aaaaaaaaaaaaaaaaaaaaaaaaaaz",['a','aa','aaa','aaaa','aaaa','aaaaaaa']))