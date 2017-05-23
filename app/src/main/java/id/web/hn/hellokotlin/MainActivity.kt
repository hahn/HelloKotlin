package id.web.hn.hellokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var button2: Button
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button) as Button
        button2 = findViewById(R.id.button2) as Button
        button.setOnClickListener { gantiTeks() }

        button2.setOnClickListener { view->
            if(!button.isEnabled) button.isEnabled = true
            Toast.makeText(this, "Button 2 yang dipijit", Toast.LENGTH_SHORT).show()
            textView.text = "Hallo dunia lagi hallo"
         }

    }

    fun gantiTeks(){

        textView = findViewById(R.id.textView) as TextView
        textView.text = "Tombol dipijit"
        button.isEnabled = false

    }
}
