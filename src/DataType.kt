fun main() {
    var a: String = "111"
    var b: String = "222"
    println(a == b)
    println(a === b)


    var c: Byte = 2
    var d: Double = 2.0
    var e: Long = 2L
    var f: Float = 2f

    var operaNum: Int = 4
    var shlOperaNum = operaNum shl (1)
    var shrOperaNum = operaNum shr (1)

    println(shlOperaNum)
    println(shrOperaNum)

    var h: String = """aaa"aaa"a"""
    println(h)

    val text1: String = "我来了"
    var text2: String = "$text1 kotlin"
    var text3: String = "$text2 ${text1.length} 啊啊啊 !!"
    println(text3)


    var arr = arrayOf(1, 2, 3, 4, 5)
    for (v in arr) {
        print(v)
        print("\t")
    }

    println()

    var arr2 = arrayOf("0", "2", "3", 'a', 32.3f)
    for (v in arr2) {
        print(v)
        print("\t")
    }


    var arr3 = arrayOfNulls<Int>(3)
    for (v in arr3) {
        println(v)
    }

    var arr4 = Array(5) { index -> (index * 2).toString() }
    for (v in arr4) {
        print(v)
        print("\t")
    }

    println()

    var intArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
    for (number in intArr) {
        print(number)
        print("\t")
    }

    println()

    var charArr: CharArray = charArrayOf('a', '1', 'b', 'c')
    for (char in charArr) {
        print(char)
        print("\t")
    }

}