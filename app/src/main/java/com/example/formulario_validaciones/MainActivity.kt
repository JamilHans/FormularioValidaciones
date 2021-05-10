package com.example.formulario_validaciones

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Integer.parseInt

class MainActivity : AppCompatActivity() {

    @SuppressLint("WrongConstant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btLimpiar.setOnClickListener(View.OnClickListener {
            limpiarCajas()
        })

        btVerificar.setOnClickListener(View.OnClickListener {
            if(etNombre.text.toString().length >= 4){
                    if(etApellidos.text.toString().length >= 4){
                            if(etEdad.text.toString().toInt() in 1..99){
                                if(etCorreo.text.toString().length in 17..99){
                                    if (etDNI.text.toString().length in 8..8){
                                        if(etCelular.text.toString().length in 9..9){
                                            SiguienteActivity()
                                        }else{
                                            Toast.makeText(this,"Su celular es invalido",Toast.LENGTH_LONG).show();
                                        }
                                    }
                                    else{
                                        Toast.makeText(this,"Su DNI es invalido",Toast.LENGTH_LONG).show();
                                    }
                                }else{
                                    Toast.makeText(this,"Su correo es invalido",Toast.LENGTH_LONG).show();
                                }
                            }else{
                                Toast.makeText(this,"Su edad es invalido",Toast.LENGTH_LONG).show();
                            }
                    }
                    else{
                        Toast.makeText(this,"Su apellido es invalido",Toast.LENGTH_LONG).show();
                    }
            }
            else{
                Toast.makeText(this,"Su nombre es invalido",Toast.LENGTH_LONG).show();
            }



        })

    }

    private fun SiguienteActivity() {
        val editTextNombre:String = etNombre.text.toString().trim()
        val editTextApellidos:String = etApellidos.text.toString().trim()
        val editTextEdad:String = etEdad.text.toString().trim()
        val editTextCorreo:String = etCorreo.text.toString().trim()
        val editTextDNI:String = etDNI.text.toString().trim()
        val editTextCelular:String = etCelular.text.toString().trim()

        var miintent = Intent(this, MostrarDatos::class.java )
        miintent.putExtra(Constans.NOMBRES, editTextNombre)
        miintent.putExtra(Constans.APELLIDOS, editTextApellidos)
        miintent.putExtra(Constans.EDAD, editTextEdad)
        miintent.putExtra(Constans.CORREO, editTextCorreo)
        miintent.putExtra(Constans.DNI,editTextDNI)
        miintent.putExtra(Constans.CELULAR,editTextCelular)
        startActivity(miintent)
    }

    private fun limpiarCajas() {
         etNombre.setText("")
         etApellidos.setText("")
         etEdad.setText("")
         etCorreo.setText("")
         etDNI.setText("")
         etCelular.setText("")
    }




}