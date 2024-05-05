//[kanary](../../../index.md)/[kanary](../index.md)/[Deserializer](index.md)

# Deserializer

[jvm]\
class [Deserializer](index.md) : [PrimitiveDeserializer](../-primitive-deserializer/index.md)

A [PrimitiveDeserializer](../-primitive-deserializer/index.md) that allows the reading of objects whose types have a defined protocol.

## Functions

| Name | Summary |
|---|---|
| [close](../-primitive-deserializer/close.md) | [jvm]<br>open override fun [close](../-primitive-deserializer/close.md)() |
| [readArray](read-array.md) | [jvm]<br>inline fun &lt;[T](read-array.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [readArray](read-array.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;out [T](read-array.md)&gt;<br>Reads an object array with each member deserialized according to its protocol. |
| [readBoolean](../-primitive-deserializer/read-boolean.md) | [jvm]<br>fun [readBoolean](../-primitive-deserializer/read-boolean.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [readBooleanArray](../-primitive-deserializer/read-boolean-array.md) | [jvm]<br>fun [readBooleanArray](../-primitive-deserializer/read-boolean-array.md)(): [BooleanArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean-array/index.html) |
| [readByte](../-primitive-deserializer/read-byte.md) | [jvm]<br>fun [readByte](../-primitive-deserializer/read-byte.md)(): [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/index.html) |
| [readChar](../-primitive-deserializer/read-char.md) | [jvm]<br>fun [readChar](../-primitive-deserializer/read-char.md)(): [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) |
| [readCharArray](../-primitive-deserializer/read-char-array.md) | [jvm]<br>fun [readCharArray](../-primitive-deserializer/read-char-array.md)(): [CharArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char-array/index.html) |
| [readDouble](../-primitive-deserializer/read-double.md) | [jvm]<br>fun [readDouble](../-primitive-deserializer/read-double.md)(): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [readDoubleArray](../-primitive-deserializer/read-double-array.md) | [jvm]<br>fun [readDoubleArray](../-primitive-deserializer/read-double-array.md)(): [DoubleArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double-array/index.html) |
| [readFloat](../-primitive-deserializer/read-float.md) | [jvm]<br>fun [readFloat](../-primitive-deserializer/read-float.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [readFloatArray](../-primitive-deserializer/read-float-array.md) | [jvm]<br>fun [readFloatArray](../-primitive-deserializer/read-float-array.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html) |
| [readInt](../-primitive-deserializer/read-int.md) | [jvm]<br>fun [readInt](../-primitive-deserializer/read-int.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [readIntArray](../-primitive-deserializer/read-int-array.md) | [jvm]<br>fun [readIntArray](../-primitive-deserializer/read-int-array.md)(): [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html) |
| [readIterable](read-iterable.md) | [jvm]<br>inline fun &lt;[T](read-iterable.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [readIterable](read-iterable.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](read-iterable.md)&gt;<br>Reads an [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) from binary with each member deserialized according to its protocol. Although [readList](read-list.md) is more efficient, this function may also parse lists. |
| [readList](read-list.md) | [jvm]<br>inline fun &lt;[T](read-list.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [readList](read-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](read-list.md)&gt;<br>Reads a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) from binary with each member deserialized according to its protocol. |
| [readLong](../-primitive-deserializer/read-long.md) | [jvm]<br>fun [readLong](../-primitive-deserializer/read-long.md)(): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |
| [readLongArray](../-primitive-deserializer/read-long-array.md) | [jvm]<br>fun [readLongArray](../-primitive-deserializer/read-long-array.md)(): [LongArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long-array/index.html) |
| [readNullable](read-nullable.md) | [jvm]<br>inline fun &lt;[T](read-nullable.md), [N](read-nullable.md) : [T](read-nullable.md) &amp; [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [readNullable](read-nullable.md)(): [T](read-nullable.md)?<br>Reads an object of the specified type from binary according to the protocol of its type, or null respectively. |
| [readNullablesArray](read-nullables-array.md) | [jvm]<br>inline fun &lt;[T](read-nullables-array.md), [N](read-nullables-array.md) : [T](read-nullables-array.md) &amp; [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [readNullablesArray](read-nullables-array.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;out [T](read-nullables-array.md)?&gt;<br>Reads an object array from binary with each member deserialized according to its protocol, or null respectively. |
| [readNullablesIterable](read-nullables-iterable.md) | [jvm]<br>inline fun &lt;[T](read-nullables-iterable.md), [N](read-nullables-iterable.md) : [T](read-nullables-iterable.md) &amp; [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [readNullablesIterable](read-nullables-iterable.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](read-nullables-iterable.md)?&gt;<br>Reads an [Iterable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterable/index.html) from binary with each member deserialized according to its protocol, or null respectively. Although [readNullablesList](read-nullables-list.md) is more efficient, this function may also parse lists. |
| [readNullablesList](read-nullables-list.md) | [jvm]<br>inline fun &lt;[T](read-nullables-list.md), [N](read-nullables-list.md) : [T](read-nullables-list.md) &amp; [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [readNullablesList](read-nullables-list.md)(): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[T](read-nullables-list.md)?&gt;<br>Reads a list from binary with each member deserialized according to its protocol, or null respectively. |
| [readObject](read-object.md) | [jvm]<br>inline fun &lt;[T](read-object.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt; [readObject](read-object.md)(): [T](read-object.md)<br>Reads an object of the specified type from binary according to the protocol of its type. |
| [readShort](../-primitive-deserializer/read-short.md) | [jvm]<br>fun [readShort](../-primitive-deserializer/read-short.md)(): [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/index.html) |
| [readShortArray](../-primitive-deserializer/read-short-array.md) | [jvm]<br>fun [readShortArray](../-primitive-deserializer/read-short-array.md)(): [ShortArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short-array/index.html) |
| [readString](../-primitive-deserializer/read-string.md) | [jvm]<br>fun [readString](../-primitive-deserializer/read-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |