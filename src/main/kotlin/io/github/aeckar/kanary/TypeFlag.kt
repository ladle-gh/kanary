package io.github.aeckar.kanary

import java.io.IOException
import kotlin.reflect.KClass
import kotlin.reflect.KFunction

/**
 * Types specified by [Schema] as having pre-defined protocols.
 */
@PublishedApi
internal val TYPES_WITH_BUILTIN_PROTOCOLS = TypeFlag.entries.asSequence().map { it.kClass }.toSet()

/**
 * Thrown when an attempt is made to read serialized data of a certain flagged type, but another type is encountered.
 */
class TypeFlagMismatchException internal constructor(message: String) : IOException(message)

/**
 * Special [bytes][ordinal] emitted to serialized data to enforce type-safety
 * and determine relative position during deserialization.
 */
internal enum class TypeFlag(val kClass: KClass<*> = Nothing::class) {
    BOOLEAN(Boolean::class),
    BYTE(Byte::class),
    CHAR(Char::class),
    SHORT(Short::class),
    INT(Int::class),
    LONG(Long::class),
    FLOAT(Float::class),
    DOUBLE(Double::class),
    BOOLEAN_ARRAY(BooleanArray::class),
    BYTE_ARRAY(ByteArray::class),
    CHAR_ARRAY(CharArray::class),
    SHORT_ARRAY(ShortArray::class),
    INT_ARRAY(IntArray::class),
    LONG_ARRAY(LongArray::class),
    FLOAT_ARRAY(FloatArray::class),
    DOUBLE_ARRAY(DoubleArray::class),
    STRING(String::class),
    OBJECT_ARRAY(Array<Any>::class),
    LIST(List::class),
    ITERABLE(Iterable::class),
    PAIR(Pair::class),
    TRIPLE(Triple::class),
    MAP_ENTRY(Map.Entry::class),
    MAP(Map::class),
    UNIT(Unit::class),
    OBJECT(Any::class),
    FUNCTION(KFunction::class),
    NULL,
    END_OBJECT;

    companion object {
        fun nameOf(ordinal: Int) = entries.find { it.ordinal == ordinal }?.name ?: "UNKNOWN"
    }
}
