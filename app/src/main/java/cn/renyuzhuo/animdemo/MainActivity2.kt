package cn.renyuzhuo.animdemo

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, MainActivity3::class.java))
        }
    }
}