package com.example.formulario_validaciones

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mostrar_datos.*

class MostrarDatos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_datos)
        var nombres: String? = intent.getStringExtra(Constans.NOMBRES)
        var apellidos: String? = intent.getStringExtra(Constans.APELLIDOS)
        var edad: String? = intent.getStringExtra(Constans.EDAD)
        var correo: String? = intent.getStringExtra(Constans.CORREO)
        var dni:String? = intent.getStringExtra(Constans.DNI)
        var celular: String? = intent.getStringExtra(Constans.CELULAR)
        tvmostrarNombre.setText(nombres.toString())
        tvmostrarApellidos.setText(apellidos.toString())
        tvmostrarEdad.setText(edad.toString())
        tvmostrarCorreo.setText(correo.toString())
        tvmostrarDNI.setText(dni.toString())
        tvmostrarCelular.setText(celular.toString())
    }
}