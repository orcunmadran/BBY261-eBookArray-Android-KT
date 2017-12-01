package net.madran.bby261.kotlinarraybook

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sayfa = 1
        var sayfalar = arrayOf(R.drawable.sayfa01, R.drawable.sayfa02, R.drawable.sayfa03, R.drawable.sayfa04, R.drawable.sayfa05)
        var metinler = arrayOf("Metin 01", "Metin 02", "Metin 03", "Metin 04", "Metin 05")
        metinTutucu.setText(metinler[0])

        ileriButon.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                if(sayfa < sayfalar.size) {
                    sayfa++
                    Log.d("Dizi", sayfalar[sayfa-1].toString())
                    sayfaTutucu.setImageResource(sayfalar[sayfa-1])
                    metinTutucu.setText(metinler[sayfa-1])
                } else {
                    Toast.makeText(this@MainActivity, "Son sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

        geriButon.setOnClickListener(object: View.OnClickListener {
            override fun onClick(view: View): Unit {
                if(sayfa > 1) {
                    sayfa--
                    Log.d("Dizi", sayfalar[sayfa-1].toString())
                    sayfaTutucu.setImageResource(sayfalar[sayfa-1])
                    metinTutucu.setText(metinler[sayfa-1])
                } else {
                    Toast.makeText(this@MainActivity, "İlk sayfadasınız..!",
                            Toast.LENGTH_LONG).show()
                }
            }
        })

    }

}