package com.com.com.cadastrojogos

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_cadastro.*

class CadastroActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        button.setOnClickListener {
            val telaSucesso = Intent(this, SucessoActivity::class.java)

            val jogo = Jogo(editText.text.toString(),
                    editText2.text.toString(),
                    editText3.text.toString().toInt())

            telaSucesso.putExtra("jogo", jogo)

            startActivity(telaSucesso)
            limpar()
        }

        button2.setOnClickListener {
            limpar()
        }
    }

    private fun limpar(){
        editText.setText("")
        editText2.setText("")
        editText3.setText("")
    }
}
