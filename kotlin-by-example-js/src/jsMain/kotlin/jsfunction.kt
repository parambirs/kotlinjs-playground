/*
https://play.kotlinlang.org/byExample/09_Kotlin_JS/02_js_function

You can inline JS code into your Kotlin code using the js("...") function.
This should be used with extreme care.
 */

fun jsFunction() {
    // Create a JS alert from a Kotlin function.
    js("""alert("alert from Kotlin!")""")

    // Create a JS object literal. The js(...) function return type is dynamic.
    val json = js("{}")
    // Add some properties by utilizing the dynamic type capabilities
    json.name = "Jane"
    json.hobby = "movies"

    // Pass the JSON to JS API
    println(JSON.stringify(json))
}