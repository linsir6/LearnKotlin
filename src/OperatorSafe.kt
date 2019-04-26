fun main() {
    var a: Int = 12
    val b: Int = 13

    a = 20

    var nullA: Int? = 12
    val nullB: Int? = 13

    nullA = null

    if (nullA == null) {
        println("nullA = $nullA")
    }

    var str: String? = "123456"
    str = null

    if (str == null) {
        println("str null")
    }

    println(str?.length)


    val builder: Test.Builder? = Test
        .Builder()
        .setName("lin")
        ?.setSex("nan")
        ?.setAge(18)

    println(builder.toString())

    val testStr: String? = null
    val result = testStr?.length?.plus(5)?.minus(10)
    println(result)
    var res = funNullMethod()
    println(res)


    var arrTest: Array<Int?> = arrayOf(1, 2, null, 3, null, 5, 6, null)
    for (index in arrTest) {
        index?.let { println("index -> $it") }
    }


    val testStr2: String? = null
    var length = 0
    length = if (testStr2 != null) testStr2.length else -1

    length = testStr2?.length ?: -1
    println(length)

//    val testStr5: String? = null
////    println(testStr5!!.length)


//    val num1: Int? = "kotlin" as Int
//    println("num1 = $num1")

    val num2: Int? = "Kotlin" as? Int
    println("num2 = $num2")
}

fun funNullMethod(): Int? {
    val str: String? = "123456"
    return str?.length
}

class Test {

    class Builder {
        private var name: String? = "Tom"
        private var age: Int? = 0
        private var sex: String? = "男"

        fun setName(name: String): Builder? {
            this.name = name
            return this
        }

        fun setAge(age: Int): Builder? {
            this.age = age
            return this
        }

        fun setSex(sex: String?): Builder? {
            this.sex = sex
            return this
        }

        override fun toString(): String {
            return "Builder(name=$name,age=$age,sex=$sex)"
        }

    }


}








