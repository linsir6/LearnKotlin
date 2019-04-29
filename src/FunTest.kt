open class FunTest {
    open var num = 3
    open fun test() {}

}

//类如果没有带open 默认是final的
class DemoTest : FunTest() {
    override var num: Int = 10
    override fun test() {}
}

