package br.com.raul.estacaohack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Criando a intenção de ir para a LoginActivity
        val intentTelaLogin = Intent(this@SplashActivity, LoginActivity::class.java)

        Handler().postDelayed({
            //Inicando a LoginActivity (executando a intentTelaLogin)
            startActivity(intentTelaLogin)
            //Finalizando este activity
            finish()
        },3000)
    }
}
