// https://play.kotlinlang.org/byExample/09_Kotlin_JS/03_external

/*
external keyword allows to declare existing JS API in a type-safe way.
 */

// Declare an existing JS function alert which takes a single String argument.
external fun alert(msg: String)

fun externalDeclaration() {
    alert("Hi!")    // Use alert as if it were regular Kotlin.
    // Kotlin checks during compilation, that a single argument of type String
    // is passed. Such a check prevents some bugs even when using pure JS API.
}