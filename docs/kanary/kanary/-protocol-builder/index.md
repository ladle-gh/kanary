//[kanary](../../../index.md)/[kanary](../index.md)/[ProtocolBuilder](index.md)

# ProtocolBuilder

[jvm]\
class [ProtocolBuilder](index.md)&lt;[T](index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;(classRef: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;*&gt;)

The scope wherein a protocol's [read](read.md) and [write](write.md) operations are defined. If the protocol of a nested class is defined and its package contains any uppercase letters, attempting to read it from binary will throw [ClassNotFoundException](https://docs.oracle.com/javase/8/docs/api/java/lang/ClassNotFoundException.html).

## Constructors

| | |
|---|---|
| [ProtocolBuilder](-protocol-builder.md) | [jvm]<br>constructor(classRef: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;*&gt;) |

## Properties

| Name | Summary |
|---|---|
| [read](read.md) | [jvm]<br>var [read](read.md): [TypedReadOperation](../-typed-read-operation/index.md)&lt;[T](index.md)&gt;?<br>The binary read operation called when [Deserializer.read](../-deserializer/read.md) is called with an object of class [T](index.md). Information deserialized from supertypes is converted into a packet, from which the read operation can use the information to create a new instance of [T](index.md). |
| [write](write.md) | [jvm]<br>var [write](write.md): [TypedWriteOperation](../-typed-write-operation/index.md)&lt;[T](index.md)&gt;?<br>The binary write operation called when [Serializer.write](../-serializer/write.md) is called with an object of class [T](index.md) If not declared, then a no-op default write operation is used. |

## Functions

| Name | Summary |
|---|---|
| [fallback](fallback.md) | [jvm]<br>fun [fallback](fallback.md)(read: [TypedReadOperation](../-typed-read-operation/index.md)&lt;[T](index.md)&gt;): [TypedReadOperation](../-typed-read-operation/index.md)&lt;[T](index.md)&gt;<br>When prepended to a [read operation](fallback.md), declares that subtypes without a read operation can still be instantiated as an instance of [T](index.md) using this read operation. Generally, this should be used for types whose subtypes have the same public API. Any information not deserialized as a result is lost. |
| [static](static.md) | [jvm]<br>fun [static](static.md)(write: [TypedWriteOperation](../-typed-write-operation/index.md)&lt;[T](index.md)&gt;): [TypedWriteOperation](../-typed-write-operation/index.md)&lt;[T](index.md)&gt;<br>When prepended to a [write operation](static.md), declares that the only information serialized from an instance of [T](index.md) is that which is specifically written here. If used, subtypes of this type may not define a protocol with a write operation. Enables certain optimizations. |