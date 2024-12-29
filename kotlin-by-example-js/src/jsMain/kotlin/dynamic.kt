/*
https://play.kotlinlang.org/byExample/09_Kotlin_JS/01_dynamic

dynamic is a special type in Kotlin/JS. It turns off Kotlin's type checker. That is needed in
order to interoperate with untyped or loosely typed environments, such as the JS ecosystem.
 */
fun dynamic() {
    val a: dynamic = "abc"  // Any value can be assigned to a dynamic variable type
    val b: String = a   // A dynamic value can be assigned to anything

    fun firstChar(s: String) = s[0]

    // A dynamic variable can be passed as an argument to any function
    println("${firstChar(a)} == ${firstChar(b)}")

    // Any property or function with any arguments can be called on a dynamic variable
    println("${a.charCodeAt(0, "dummy argument")} == ${b[0].toInt()}")

    // A function call on a dynamic variable always returns a dynamic value, so it is possible
    // to chain the calls
    println(a.charAt(1).repeat(3))

    fun plus(v: dynamic) = v + 2

    // operators, assignments, and indexed access ([..]) are translated "as is". Beware!
    println("2 + 2 = ${plus(2)}")
    println("'2' + 2 = ${plus("2")}")
}