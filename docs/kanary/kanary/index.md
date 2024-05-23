//[kanary](../../index.md)/[kanary](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [Deserializer](-deserializer/index.md) | [jvm]<br>sealed interface [Deserializer](-deserializer/index.md)<br>Reads serialized data from a stream in Kanary format. |
| [InputDeserializer](-input-deserializer/index.md) | [jvm]<br>class [InputDeserializer](-input-deserializer/index.md)(stream: [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html), schema: [Schema](-schema/index.md)) : [Deserializer](-deserializer/index.md), [Closeable](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html)<br>Reads serialized data from a stream in Kanary format. |
| [MalformedProtocolException](-malformed-protocol-exception/index.md) | [jvm]<br>class [MalformedProtocolException](-malformed-protocol-exception/index.md) : [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)<br>Thrown when an attempt is made to define a protocol for a class that is not top-level. |
| [MissingOperationException](-missing-operation-exception/index.md) | [jvm]<br>class [MissingOperationException](-missing-operation-exception/index.md) : [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)<br>Thrown when a [read](-protocol-builder/read.md) or [write](-protocol-builder/write.md) operation is expected, but not found. |
| [ObjectDeserializer](-object-deserializer/index.md) | [jvm]<br>class [ObjectDeserializer](-object-deserializer/index.md) : [Deserializer](-deserializer/index.md)<br>Deserializer allowing extraction of data from supertypes with a defined [write operation](-protocol-builder/write.md). |
| [OutputSerializer](-output-serializer/index.md) | [jvm]<br>class [OutputSerializer](-output-serializer/index.md)(stream: [OutputStream](https://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html), schema: [Schema](-schema/index.md)) : [Closeable](https://docs.oracle.com/javase/8/docs/api/java/io/Closeable.html), [Flushable](https://docs.oracle.com/javase/8/docs/api/java/io/Flushable.html), [Serializer](-serializer/index.md)<br>Writes serialized data to a stream in Kanary format. |
| [Protocol](-protocol/index.md) | [jvm]<br>interface [Protocol](-protocol/index.md)<br>A locally defined binary I/O protocol. |
| [ProtocolBuilder](-protocol-builder/index.md) | [jvm]<br>class [ProtocolBuilder](-protocol-builder/index.md)&lt;[T](-protocol-builder/index.md) : [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)&gt;(classRef: [KClass](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.reflect/-k-class/index.html)&lt;*&gt;)<br>The scope wherein a protocol's [read](-protocol-builder/read.md) and [write](-protocol-builder/write.md) operations are defined. If the protocol of a nested class is defined and its package contains any uppercase letters, attempting to read it from binary will throw [ClassNotFoundException](https://docs.oracle.com/javase/8/docs/api/java/lang/ClassNotFoundException.html). |
| [ReassignmentException](-reassignment-exception/index.md) | [jvm]<br>typealias [ReassignmentException](-reassignment-exception/index.md) = [kanary.utils.ReassignmentException](../kanary.utils/-reassignment-exception/index.md)<br>Thrown when there is an attempt to assign a value to a [read/write operation](-protocol-builder/index.md) that has already been given a value. |
| [Schema](-schema/index.md) | [jvm]<br>class [Schema](-schema/index.md)<br>Defines a set of protocols corresponding to how certain types should be written to and read from binary. |
| [SchemaBuilder](-schema-builder/index.md) | [jvm]<br>class [SchemaBuilder](-schema-builder/index.md)<br>The scope wherein binary I/O protocols may be [defined](-schema-builder/define.md). |
| [Serializer](-serializer/index.md) | [jvm]<br>sealed interface [Serializer](-serializer/index.md)<br>Serializes data to a stream in Kanary format. |
| [TypedReadOperation](-typed-read-operation/index.md) | [jvm]<br>typealias [TypedReadOperation](-typed-read-operation/index.md)&lt;[T](-typed-read-operation/index.md)&gt; = [ObjectDeserializer](-object-deserializer/index.md).() -&gt; [T](-typed-read-operation/index.md)<br>Lambda specified by [read operation](-protocol-builder/read.md). |
| [TypedWriteOperation](-typed-write-operation/index.md) | [jvm]<br>typealias [TypedWriteOperation](-typed-write-operation/index.md)&lt;[T](-typed-write-operation/index.md)&gt; = [Serializer](-serializer/index.md).([T](-typed-write-operation/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Lambda specified by [write operation](-protocol-builder/index.md). |
| [TypeFlagMismatchException](-type-flag-mismatch-exception/index.md) | [jvm]<br>class [TypeFlagMismatchException](-type-flag-mismatch-exception/index.md) : [IOException](https://docs.oracle.com/javase/8/docs/api/java/io/IOException.html)<br>Thrown when an attempt is made to read serialized data of a certain flagged type, but another type is encountered. |

## Functions

| Name | Summary |
|---|---|
| [define](define.md) | [jvm]<br>inline fun &lt;[T](define.md)&gt; [define](define.md)(noinline read: [TypedReadOperation](-typed-read-operation/index.md)&lt;out [T](define.md)&gt;? = null, noinline write: [TypedWriteOperation](-typed-write-operation/index.md)&lt;in [T](define.md)&gt;? = null): [Protocol](-protocol/index.md) |
| [deserializer](deserializer.md) | [jvm]<br>fun [InputStream](https://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html).[deserializer](deserializer.md)(protocols: [Schema](-schema/index.md)): [InputDeserializer](-input-deserializer/index.md)<br>See [Schema](-schema/index.md) for a list of types that can be deserialized by default. |
| [fallback](fallback.md) | [jvm]<br>fun &lt;[T](fallback.md)&gt; [fallback](fallback.md)(read: [TypedReadOperation](-typed-read-operation/index.md)&lt;out [T](fallback.md)&gt;): [TypedReadOperation](-typed-read-operation/index.md)&lt;out [T](fallback.md)&gt;<br>Applies the '[fallback](-protocol-builder/fallback.md)' modifier to the given read operation. |
| [schema](schema.md) | [jvm]<br>inline fun [schema](schema.md)(builder: [SchemaBuilder](-schema-builder/index.md).() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)): [Schema](-schema/index.md)<br>Provides a scope wherein protocols for various classes may be defined. A schema with no protocols defined is legal, and should be stored as a variable if used more than once. |
| [serializer](serializer.md) | [jvm]<br>fun [OutputStream](https://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html).[serializer](serializer.md)(protocols: [Schema](-schema/index.md)): [OutputSerializer](-output-serializer/index.md)<br>See [Schema](-schema/index.md) for a list of types that can be serialized by default. |
| [static](static.md) | [jvm]<br>fun &lt;[T](static.md)&gt; [static](static.md)(write: [TypedWriteOperation](-typed-write-operation/index.md)&lt;in [T](static.md)&gt;): [TypedWriteOperation](-typed-write-operation/index.md)&lt;in [T](static.md)&gt;<br>Applies the 'static' modifier to the given write operation. |
| [write](write.md) | [jvm]<br>fun [Serializer](-serializer/index.md).[write](write.md)(vararg objs: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?)<br>Writes the objects in binary format according to the protocol of each type. Null objects are accepted, however their non-nullable type information is erased. If an object is not null and its type does not have a defined protocol, the protocol of its superclass or the first interface declared in source code with a protocol is chosen. If no objects are supplied, nothing is serialized. |