package br.senai.sp.jandira.imcapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cardImc: CardView = findViewById(R.id.card_imc)
        val cardNcd: CardView = findViewById(R.id.card_ncd)

        card_imc.setOnClickListener(){

            val abrirImc = Intent(this, ImcActivity2::class.java)
            startActivity(abrirImc)
        }
        cardNcd.setOnClickListener {
            val abrirNcd = Intent(this, NcdActivity2::class.java)
            startActivity(abrirNcd)
        }
    }
}