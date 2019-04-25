fun main() {

//    var a = 1
//    var b = -2
//    var c = true
//    var d = false
//
//// 操作符实现
//    println("+a = ${+a}\t -a = ${-a}\t !c = ${!c}")
//    println("+b = ${+b}\t -b = ${-b}\t !d = ${!d}")
//
//// 操作符重载实现
//    println("+a = ${a.unaryPlus()}\t -a = ${a.unaryMinus()}\t !c = ${c.not()}")
//    println("+b = ${b.unaryPlus()}\t -b = ${b.unaryMinus()}\t !d = ${d.not()}")



//    var a = 10
//    var b = 10
//    var c = 10
//    var d = 10
//
//// 操作符实现
//    println("a++ = ${a++} \t b-- = ${b--} \t ++c = ${++c} \t --d = ${--d}")
//
//// 操作符重载方式实现，或许你看不明白上表中代码，不过这没关系，你只要记住上面前缀与后缀操作的区别就行
//    a.also { a.inc() }
//    b.also { b.dec() }
//    c.inc().also { c = it }
//    d.dec().also { d = it }
//    println("a = $a \t b = $b \t c = $c \t d = $d")



// 简单的二元操作
    val a = 10
    val b = 2
    val c = "2"
    val d = "Kotlin"

// 操作符实现
    println("a + d = " + a + d)
    println("c + d = " + c + d)
    println("a + b = ${a + b} \t a - b = ${a - b} \t a * b = ${a * b} \t a / b = ${a / b} \t a % b = ${a % b}")

// 操作符重载实现
// println("a + d = ${a + d}") 错误：字符串模板限制只能为数值型
    println("a + b = ${a.plus(b)} \t a - b = ${a.minus(b)} \t a * b = ${a.times(b)} \t a / b = ${a.div(b)} \t a % b = ${a.rem(b)}")
// println(a.plus(d))  错误：因为第一个操作数`a`限制了其plus()方法的参数，
// println(d.plus(a))  正确：因为plus()方法的参数为超（Any）类型



}