package wcc.com.lanadordedados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lancarDados= findViewById<Button>(R.id.lanceDadosBotao)
        var valorDado1=findViewById<TextView>(R.id.dadoUm)
        var valorDado2=findViewById<TextView>(R.id.dadoDois)

        lancarDados.setOnClickListener{
            valorDado1.text=lancarDados().toString()
            valorDado2.text=lancarDados().toString()
        }
    }

    fun lancarDados(): Int {
        return (1..6).random()
    }
}