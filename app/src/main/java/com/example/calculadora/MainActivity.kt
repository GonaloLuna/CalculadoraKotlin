package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var isNewOp = true
    var oldNumber = ""
    var op = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun numberEvent(view: View) {

        if(isNewOp)
            editText.setText("")

        isNewOp = false

        var boClick = editText.text.toString()
        var buSelect = view as Button

        when(buSelect.id){

            boton1.id -> {boClick += "1"}
            boton2.id -> {boClick += "2"}
            boton3.id -> {boClick += "3"}
            boton4.id -> {boClick += "4"}
            boton5.id -> {boClick += "5"}
            boton6.id -> {boClick += "6"}
            boton7.id -> {boClick += "7"}
            boton8.id -> {boClick += "8"}
            boton9.id -> {boClick += "9"}
            boton0.id -> {boClick += "0"}
            botonPunto.id -> {boClick += "."}

        }

        editText.setText(boClick)
    }

    fun numberEvent2(view: View) {

        if(isNewOp)
            editText.setText("")

        isNewOp = false

        var boClick = editText.text.toString()
        var buSelect = view as Button

        when(buSelect.id){

            boton11.id -> {boClick += "1"}
            boton22.id -> {boClick += "2"}
            boton33.id -> {boClick += "3"}
            boton44.id -> {boClick += "4"}
            boton55.id -> {boClick += "5"}
            boton66.id -> {boClick += "6"}
            boton77.id -> {boClick += "7"}
            boton88.id -> {boClick += "8"}
            boton99.id -> {boClick += "9"}
            boton00.id -> {boClick += "0"}
            botonPuntoo.id -> {boClick += "."}

        }

        editText.setText(boClick)
    }

    fun OperatorEvent(view: View) {

        isNewOp = true

        oldNumber = editText.text.toString()

        var boSelect = view as Button

        when(boSelect.id){

            botonMas.id -> {op = "+"}
            botonMenos.id -> {op = "-"}
            botonMul.id -> {op = "x"}
            botonDiv.id -> {op = "/"}
            botonPorcen.id -> {op = "%"}

            botonMass.id -> {op = "+"}
            botonMenoss.id -> {op = "-"}
            botonMull.id -> {op = "x"}
            botonDivv.id -> {op = "/"}
        }

    }

    fun OperatorEvent2(view: View) {

        isNewOp = true

        oldNumber = editText.text.toString()

        var boSelect = view as Button

        when(boSelect.id){

            botonMass.id -> {op = "+"}
            botonMenoss.id -> {op = "-"}
            botonMull.id -> {op = "x"}
            botonDivv.id -> {op = "/"}
        }

    }

    fun equalEvent(view: View) {

        var newNumber = editText.text.toString()

        var resultado = 0.0

        when(op){

            "+" -> {resultado = oldNumber.toDouble() + newNumber.toDouble()}
            "-" -> {resultado = oldNumber.toDouble() - newNumber.toDouble()}
            "x" -> {resultado = oldNumber.toDouble() * newNumber.toDouble()}
            "/" -> {resultado = oldNumber.toDouble() / newNumber.toDouble()}
            "%" -> {resultado = oldNumber.toDouble() % newNumber.toDouble()}
        }

        editText.setText(resultado.toString())
    }

    fun equalEvent2(view: View) {

        var newNumber = editText.text.toString()

        var resultado = 0.0

        when(op){

            "+" -> {resultado = oldNumber.toDouble() + newNumber.toDouble()}
            "-" -> {resultado = oldNumber.toDouble() - newNumber.toDouble()}
            "x" -> {resultado = oldNumber.toDouble() * newNumber.toDouble()}
            "/" -> {resultado = oldNumber.toDouble() / newNumber.toDouble()}
        }

        editText.setText(resultado.toString())
    }

    fun delEvent(view: View) {

        editText.setText("0")
        isNewOp = true

    }

    fun delEvent2(view: View) {

        editText.setText("0")
        isNewOp = true

    }

    fun hex_dec(caracter: Char): Int {
        return when (caracter) {
            'a' -> 10
            'b' -> 11
            'c' -> 12
            'd' -> 13
            'e' -> 14
            'f' -> 15
            'A' -> 10
            'B' -> 11
            'C' -> 12
            'D' -> 13
            'E' -> 14
            'E' -> 15
            else -> caracter.toString().toInt()
        }

    }

        fun convHexa_dec(hexadecimal: String): Int {
            var decimal: Int = 0
            var potencia = 0
            for (x in hexadecimal.length - 1 downTo 0) {
                val valor = hex_dec(hexadecimal[x])
                val elevado = Math.pow(16.0, potencia.toDouble()).toInt() * valor
                decimal += elevado
                potencia++
            }
            return decimal
        }

        fun convBin_Dec(num: Int): Int {
            var num = num
            var decimalNumber = 0
            var i = 0
            var remainder: Int

            while (num != 0) {
                remainder = num % 10
                num /= 10
                decimalNumber += (remainder * Math.pow(2.0, i.toDouble())).toInt()
                ++i
            }
            return decimalNumber
        }

    }

