fun main() {

    var numA = 2
    if (numA == 2) {
        println("true")
    } else {
        println("false")
    }

    var num: Int = if (numA > 2) 3 else 5;
    print("numB -> $num")

    println()

    var numC: Int = if (numA > 2) {
        numA++
        numA = 10
        numA
    } else {
        numA = 30
        numA
    }

    println(numC)


    //递增的
    for (i in 0 until 5) {
        print("i -> $i \t")
    }

    println()

    //递减的
    for (i in 15 downTo 11) {
        print("i -> $i \t")
    }


    println()

    for (i in 20..25) {
        print("i -> $i \t")
    }

    println()

    for (i in 10 until 16 step 2) {
        print("i -> $i \t")
    }

    println()

    for (i in "abcdefg") {
        print("i -> $i \t")
    }

    println()

    var arrayListOne = arrayOf(10, 20, 30, 40, 50)
    for (i in arrayListOne) {
        print("i -> $i \t")
    }

    println()

    var arrayListTwo = arrayOf(1, 3, 5, 7, 9)
    for (i in arrayListTwo.indices) {
        println("arrayListTwo[$i] -> " + arrayListTwo[i])
    }

    var arrayListThree = arrayOf(2, 'a', 3, false, 9)
    var iterator: Iterator<Any> = arrayListThree.iterator()

    while (iterator.hasNext()) {
        println(iterator.next())
    }

    when (5) {
        1 -> {
            println("1")
        }

        2 -> println("2")

        3 -> println("3")

        else -> {
            println("0")
        }

    }


    var num6: Int = 5
    when (num6 > 5) {
        true -> {
            println("num > 5")
        }
        false -> {
            println("num < 5")
        }
        else -> {
            println("other")
        }
    }


    var arrayList = arrayOf(1, 2, 3, 4, 5)
    when (20) {
        in arrayList.toIntArray() -> {
            println("1 存在于arrayList数组中")
        }
        in 0..10 -> println("在0-10之中")
        !in 5..10 -> print("1不属于5-10")
        else -> {
            println("都错啦")
        }
    }

    when ("abc") {
        is String -> println("abc是一个字符串")
        else -> {
            println("abc不是一个字符串")
        }
    }


    var a: Int = 2
    when (a) {
        !is Int -> {
            println("$a 不是一个Int类型的值")
        }
        else -> {
            a = a.shl(2)
            println("a -> $a")
        }
    }


    var array = arrayOfNulls<String>(3)
    when {
        true -> {
            for (i in array) {
                print(" $i \t")
            }
            println()
        }
        else -> {

        }
    }

    var num7 = 5
    var count7 = 1
    while (count7 < 10) {
        println("循环了 $count7 次")
        count7++
    }

    var str: String = ""
    var str2: String? = null
    if (str.isBlank()) {
        println("true")
    }


}









