enum class State {

    NORMAL, NO_DATA, NO_INTERNET, ERROR, OTHER

}

enum class Color(var argb: Int) {
    RED(0xFF0000),
    WHITE(0xFFFFFF),
    BLACK(0x000000),
    GREEN(0x00FF00)
}


enum class ConsoleColor(var argb: Int) {
    RED(0xFF0000) {
        override fun print() {
            println("我是枚举常量 RED ")
        }
    },
    WHITE(0xFFFFFF) {
        override fun print() {
            println("我是枚举常量 WHITE ")
        }
    },
    BLACK(0x000000) {
        override fun print() {
            println("我是枚举常量 BLACK ")
        }
    },
    GREEN(0x00FF00) {
        override fun print() {
            println("我是枚举常量 GREEN ")
        }
    };

    abstract fun print()
}

fun main() {
    State.NORMAL.name
    State.NO_DATA.name
    State.NORMAL.ordinal
    ConsoleColor.BLACK.print()

    println(enumValues<Color>().joinToString { it.name })
    println(enumValueOf<Color>("RED"))

    println(Color.values()[2])

}