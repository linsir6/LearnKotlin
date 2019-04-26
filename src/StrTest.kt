fun main() {
    var str = "kotlin very good"
    println(str.first())
    println(str[0])
    println(str.get(0))

    str.firstOrNull {
        it == '0'
    }

    println(str.last())
    println(str.get(str.lastIndex))
    println(str[str.lastIndex])


    println(str.indexOfFirst { it == 'o' })
    println(str.indexOfLast { it == 'o' })
    println(str.indexOf('o', 0))
    println(str.indexOf("very", 0))
    println(str.lastIndexOf('o'))
    println(str.lastIndexOf("good"))

    println(str.length)
    println(str.count())

    val count = str.count { it == 'o' }
    println("count : $count")

    println(str?.isEmpty())
    println(str.isEmpty())
    println(str.isNullOrEmpty())
    println(str?.isBlank())
    println(str?.isNotBlank())
    println(str.isNullOrBlank())


    val oldStr = "kotlin"
    println(oldStr.plus(" very good"))
    println(oldStr + " very good")

    val str4 = "kotlin"
    println("字符串反转 ${str4.reversed()}")



    println(str.startsWith('k'))
    println(str.startsWith("kot"))
    println(str.startsWith("lin", 3))


}