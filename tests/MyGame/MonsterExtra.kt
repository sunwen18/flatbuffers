// automatically generated by the FlatBuffers compiler, do not modify

package MyGame

import java.nio.*
import kotlin.math.sign
import com.google.flatbuffers.*

@Suppress("unused")
class MonsterExtra : Table() {

    fun __init(_i: Int, _bb: ByteBuffer)  {
        __reset(_i, _bb)
    }
    fun __assign(_i: Int, _bb: ByteBuffer) : MonsterExtra {
        __init(_i, _bb)
        return this
    }
    val d0 : Double
        get() {
            val o = __offset(4)
            return if(o != 0) bb.getDouble(o + bb_pos) else Double.NaN
        }
    fun mutateD0(d0: Double) : Boolean {
        val o = __offset(4)
        return if (o != 0) {
            bb.putDouble(o + bb_pos, d0)
            true
        } else {
            false
        }
    }
    val d1 : Double
        get() {
            val o = __offset(6)
            return if(o != 0) bb.getDouble(o + bb_pos) else Double.NaN
        }
    fun mutateD1(d1: Double) : Boolean {
        val o = __offset(6)
        return if (o != 0) {
            bb.putDouble(o + bb_pos, d1)
            true
        } else {
            false
        }
    }
    val d2 : Double
        get() {
            val o = __offset(8)
            return if(o != 0) bb.getDouble(o + bb_pos) else Double.POSITIVE_INFINITY
        }
    fun mutateD2(d2: Double) : Boolean {
        val o = __offset(8)
        return if (o != 0) {
            bb.putDouble(o + bb_pos, d2)
            true
        } else {
            false
        }
    }
    val d3 : Double
        get() {
            val o = __offset(10)
            return if(o != 0) bb.getDouble(o + bb_pos) else Double.NEGATIVE_INFINITY
        }
    fun mutateD3(d3: Double) : Boolean {
        val o = __offset(10)
        return if (o != 0) {
            bb.putDouble(o + bb_pos, d3)
            true
        } else {
            false
        }
    }
    val f0 : Float
        get() {
            val o = __offset(12)
            return if(o != 0) bb.getFloat(o + bb_pos) else Float.NaN
        }
    fun mutateF0(f0: Float) : Boolean {
        val o = __offset(12)
        return if (o != 0) {
            bb.putFloat(o + bb_pos, f0)
            true
        } else {
            false
        }
    }
    val f1 : Float
        get() {
            val o = __offset(14)
            return if(o != 0) bb.getFloat(o + bb_pos) else Float.NaN
        }
    fun mutateF1(f1: Float) : Boolean {
        val o = __offset(14)
        return if (o != 0) {
            bb.putFloat(o + bb_pos, f1)
            true
        } else {
            false
        }
    }
    val f2 : Float
        get() {
            val o = __offset(16)
            return if(o != 0) bb.getFloat(o + bb_pos) else Float.POSITIVE_INFINITY
        }
    fun mutateF2(f2: Float) : Boolean {
        val o = __offset(16)
        return if (o != 0) {
            bb.putFloat(o + bb_pos, f2)
            true
        } else {
            false
        }
    }
    val f3 : Float
        get() {
            val o = __offset(18)
            return if(o != 0) bb.getFloat(o + bb_pos) else Float.NEGATIVE_INFINITY
        }
    fun mutateF3(f3: Float) : Boolean {
        val o = __offset(18)
        return if (o != 0) {
            bb.putFloat(o + bb_pos, f3)
            true
        } else {
            false
        }
    }
    fun dvec(j: Int) : Double {
        val o = __offset(20)
        return if (o != 0) {
            bb.getDouble(__vector(o) + j * 8)
        } else {
            0.0
        }
    }
    val dvecLength : Int
        get() {
            val o = __offset(20); return if (o != 0) __vector_len(o) else 0
        }
    val dvecAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(20, 8)
    fun dvecInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 20, 8)
    fun mutateDvec(j: Int, dvec: Double) : Boolean {
        val o = __offset(20)
        return if (o != 0) {
            bb.putDouble(__vector(o) + j * 8, dvec)
            true
        } else {
            false
        }
    }
    fun fvec(j: Int) : Float {
        val o = __offset(22)
        return if (o != 0) {
            bb.getFloat(__vector(o) + j * 4)
        } else {
            0.0f
        }
    }
    val fvecLength : Int
        get() {
            val o = __offset(22); return if (o != 0) __vector_len(o) else 0
        }
    val fvecAsByteBuffer : ByteBuffer get() = __vector_as_bytebuffer(22, 4)
    fun fvecInByteBuffer(_bb: ByteBuffer) : ByteBuffer = __vector_in_bytebuffer(_bb, 22, 4)
    fun mutateFvec(j: Int, fvec: Float) : Boolean {
        val o = __offset(22)
        return if (o != 0) {
            bb.putFloat(__vector(o) + j * 4, fvec)
            true
        } else {
            false
        }
    }
    companion object {
        fun validateVersion() = Constants.FLATBUFFERS_22_11_23()
        fun getRootAsMonsterExtra(_bb: ByteBuffer): MonsterExtra = getRootAsMonsterExtra(_bb, MonsterExtra())
        fun getRootAsMonsterExtra(_bb: ByteBuffer, obj: MonsterExtra): MonsterExtra {
            _bb.order(ByteOrder.LITTLE_ENDIAN)
            return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb))
        }
        fun MonsterExtraBufferHasIdentifier(_bb: ByteBuffer) : Boolean = __has_identifier(_bb, "MONE")
        fun createMonsterExtra(builder: FlatBufferBuilder, d0: Double, d1: Double, d2: Double, d3: Double, f0: Float, f1: Float, f2: Float, f3: Float, dvecOffset: Int, fvecOffset: Int) : Int {
            builder.startTable(11)
            addD3(builder, d3)
            addD2(builder, d2)
            addD1(builder, d1)
            addD0(builder, d0)
            addFvec(builder, fvecOffset)
            addDvec(builder, dvecOffset)
            addF3(builder, f3)
            addF2(builder, f2)
            addF1(builder, f1)
            addF0(builder, f0)
            return endMonsterExtra(builder)
        }
        fun startMonsterExtra(builder: FlatBufferBuilder) = builder.startTable(11)
        fun addD0(builder: FlatBufferBuilder, d0: Double) = builder.addDouble(0, d0, Double.NaN)
        fun addD1(builder: FlatBufferBuilder, d1: Double) = builder.addDouble(1, d1, Double.NaN)
        fun addD2(builder: FlatBufferBuilder, d2: Double) = builder.addDouble(2, d2, Double.POSITIVE_INFINITY)
        fun addD3(builder: FlatBufferBuilder, d3: Double) = builder.addDouble(3, d3, Double.NEGATIVE_INFINITY)
        fun addF0(builder: FlatBufferBuilder, f0: Float) = builder.addFloat(4, f0, Double.NaN)
        fun addF1(builder: FlatBufferBuilder, f1: Float) = builder.addFloat(5, f1, Double.NaN)
        fun addF2(builder: FlatBufferBuilder, f2: Float) = builder.addFloat(6, f2, Double.POSITIVE_INFINITY)
        fun addF3(builder: FlatBufferBuilder, f3: Float) = builder.addFloat(7, f3, Double.NEGATIVE_INFINITY)
        fun addDvec(builder: FlatBufferBuilder, dvec: Int) = builder.addOffset(8, dvec, 0)
        fun createDvecVector(builder: FlatBufferBuilder, data: DoubleArray) : Int {
            builder.startVector(8, data.size, 8)
            for (i in data.size - 1 downTo 0) {
                builder.addDouble(data[i])
            }
            return builder.endVector()
        }
        fun startDvecVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(8, numElems, 8)
        fun addFvec(builder: FlatBufferBuilder, fvec: Int) = builder.addOffset(9, fvec, 0)
        fun createFvecVector(builder: FlatBufferBuilder, data: FloatArray) : Int {
            builder.startVector(4, data.size, 4)
            for (i in data.size - 1 downTo 0) {
                builder.addFloat(data[i])
            }
            return builder.endVector()
        }
        fun startFvecVector(builder: FlatBufferBuilder, numElems: Int) = builder.startVector(4, numElems, 4)
        fun endMonsterExtra(builder: FlatBufferBuilder) : Int {
            val o = builder.endTable()
            return o
        }
        fun finishMonsterExtraBuffer(builder: FlatBufferBuilder, offset: Int) = builder.finish(offset, "MONE")
        fun finishSizePrefixedMonsterExtraBuffer(builder: FlatBufferBuilder, offset: Int) = builder.finishSizePrefixed(offset, "MONE")
    }
}
