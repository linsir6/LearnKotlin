import kotlin.math.min

class ClassTest(var num: Int) {

    //允许有一个主构函数和多个二级构造函数(辅助构造函数)

    constructor(str: String, num: Int) : this(num) {

    }

    init {
        num = 5
        println("num = $num")
    }
}

class Mine {
    val id: String = "123"
    var name: String? = "kotlin"
    var age: Int? = 22
    var sex: String? = "男"
    var weight: Float = 120.3f

    private var test: String = ""
        get() = "123"
        set(value) {
            field = value
        }

    var test1: String = ""
        get() = "123"
        set(value) {
            field = value
        }

    val test2: String
        get() = "123"

    var count = 0
        set(value) {
            field = if (value > 10) value else 0
        }

    private var _table: Map<String, Int>? = null
    public val table: Map<String, Int>
        get() {
            if (_table == null) {
                _table = HashMap()
            }
            return _table ?: throw AssertionError("Set to null by another thread")
        }


}


fun main() {
    var test = ClassTest(1)
    val mine = Mine()
    println("id = ${mine.id} \t name = ${mine.name}")
    mine.test1 = "1"

    mine.count = 5
    println(mine.count)

}