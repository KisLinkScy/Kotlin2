package Polinom

import kotlin.math.abs
import kotlin.math.max
class Polinom(coef: DoubleArray) {

    private var coef: DoubleArray = coef.clone()
    val coefficients: DoubleArray
        get() = coef.clone() //Возвращаем копию коэффициентов полинома
    val power : Int
        get() = coef.size - 1

    init{
        correctPower()
    }
    constructor() : this(doubleArrayOf(0.0))
    private fun correctPower() {
        var b = true
        coef = coef.reversed().filterIndexed { i, v ->
            if (v.compareTo(0.0) != 0) b = false
            !b || (i == power)
        }.reversed().toDoubleArray()
    }

    operator fun plus(other: Polinom) =
        Polinom(DoubleArray(max(power, other.power) + 1)
        {
            (if (it < coef.size) coef[it] else 0.0) +
                    (if (it < other.coef[it]) other.coef[it] else 0.0)
        }
        )

    operator fun times(k: Double) =
        Polinom(DoubleArray(power + 1) { coef[it] * k })

    operator fun minus(other: Polinom) =
        this + other * -1.0

    operator fun times(other: Polinom): Polinom{
        val t = DoubleArray(power + other.power + 1){ 0.0 }
        coef.forEachIndexed { ti, tc ->
            other.coef.forEachIndexed{ oi, oc ->
                t[ti + oi] += tc * oc
            }
        }
        return Polinom(t)
    }

    operator fun div(k: Double) : Polinom? =
        if (k.compareTo(0.0)!=0)
            this*(1.0/k)
        else
            null

    override fun toString(): String {
        val res = StringBuilder()
        val pow = power
        fun isLong(x: Double) = abs(x-x.toLong()).compareTo(0.0) == 0
        coef.reversed().forEachIndexed { ind, v ->
            val i = pow - ind
            if (v.compareTo(0.0) != 0 || pow == 0) {
                res.append(if (v < 0) "-" else if (i < pow) "+" else "")
                val c = abs(v)
                if (c.compareTo(1.0) != 0 || i == 0)
                    res.append(if (isLong(c)) c.toLong() else c)
                if (i >= 1) {
                    res.append('x')
                    if (i > 1) {
                        res.append("^$i")
                    }
                }
            }
        }
        return res.toString()
    }

    operator fun invoke(x: Double): Double{
        var pow = 1.0
        return coef.reduce { acc, d ->
            pow *= x; acc + d * pow
        }
    }
}