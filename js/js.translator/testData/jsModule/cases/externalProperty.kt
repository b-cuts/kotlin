package foo

@JsModule("lib") @native val foo: Int = noImpl

fun box(): String {
    assertEquals(23, foo)
    return "OK"
}