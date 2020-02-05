package br.com.raul.estacaohack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //Criando o click do botão entrar
        btnEntrar.setOnClickListener {

            //recupendo os valores digitados
            val usuario = edtUsuario.text.toString().trim()
            val senha = edtSenhaLogin.text.toString().trim()
        }
    }
}
