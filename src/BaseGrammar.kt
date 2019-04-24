const val NUM_A = 6

class BaseGrammar {


    //第一次用到的时候，才会去加载，不能是基本数据类型
    private lateinit var s: String

    private val mTitles: Array<String> by lazy {
        arrayOf(
            "111",
            "222",
            "333"
        )
    }

    private val str: String by lazy {
        "延时初始化字符串"
    }

    init {
        println("123456")
    }

    companion object {
        const val NUM_C = "伴生对象声明"
    }
}

object TestConst {
    const val NUM_B = "object修饰的类中"
}

fun main(args: Array<String>) {
    println("Hello, world !")
    var a: Int = 10
    var b = 5
    var c: Float
    println(a)
    println(b)
    c = 12.5f
    c += 1
    println("开心 $c")

    var d: String? = null
    println(d.hashCode())
    BaseGrammar()

    println("NUM_A => $NUM_A")
    println("NUM_B => ${TestConst.NUM_B}")
    println("NUM_C => ${BaseGrammar.NUM_C}")

}
