open class A {
    open fun foo(i: Int = 10) {}
}

class B : A() {
    override fun foo(i: Int) {
        super.foo(i)
        println(i)
    }

    fun callFun(
        str: String
        , isTrue: Boolean = false
        , numA: Int = 2
        , numB: Float = 2.0f
        , numC: Int = 2
    ) {
        println("hello world")
    }

    fun varargFun(numA: Int, vararg str: String) {
        for (s in str) {
            println(s)
        }
    }

    fun test1() = 2

    fun test2(num: Int) = num * 2;

    fun test3(x: Float, y: Int = 2) = x * y
}

fun main() {
    B().foo()
    B().callFun("str")
    B().callFun("str", true, 1, 1.0f, 1)
    B().callFun("str", isTrue = false, numA = 8, numB = 2f, numC = 5)
    B().callFun("str", isTrue = false)
    B().varargFun(1, "1", "2", "3", "4")

    var strArray = arrayOf("1", "2", "3", "4")
    B().varargFun(1, *strArray)

    println(B().test1())
    println(B().test2(2))
    println(B().test3(2.5f))


}









