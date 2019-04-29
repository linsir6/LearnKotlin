interface Demo1Interface {
    fun fun1()
}

class Demo1 : Demo1Interface {
    override fun fun1() {
        println("---lin---> fun1")
    }
}

interface Demo3Interface {
    val num1: Int
    val num2: Int
}

class Demo3(override val num1: Int, override val num2: Int) : Demo3Interface {
    fun sum(): Int {
        return num1 + num2;
    }
}

interface Demo4InterfaceOne {
    fun fun1() {
        println("one fun1")
    }

    fun fun2() {
        println("one fun2")
    }
}

interface Demo4InterfaceTwo {
    fun fun1() {
        println("two fun1")
    }

    fun fun2() {
        println("two fun2")
    }
}

class Demo4 : Demo4InterfaceOne, Demo4InterfaceTwo {
    override fun fun1() {
        super<Demo4InterfaceTwo>.fun1()
        println("---lin fun1")
    }

    override fun fun2() {

    }

}

fun main() {
    var demo = Demo1()
    demo.fun1()

    var demo3 = Demo3(1, 2)
    println(demo3.sum())


}









