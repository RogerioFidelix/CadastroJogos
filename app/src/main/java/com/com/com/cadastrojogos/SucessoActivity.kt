package com.com.com.cadastrojogos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sucesso.*

class SucessoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucesso)

        val jogo = intent.getParcelableExtra<Jogo>("jogo")
        textView.text = getString(R.string.mensagem_sucesso,
                jogo.nome,
                jogo.genero,
                jogo.anoLancamento)
    }
}
