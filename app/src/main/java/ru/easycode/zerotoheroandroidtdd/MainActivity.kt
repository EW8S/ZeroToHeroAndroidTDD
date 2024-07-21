package ru.easycode.zerotoheroandroidtdd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        val textView = findViewById<TextView>(R.id.countTextView)
        val button = findViewById<Button>(R.id.incrementButton)
        val root = findViewById<LinearLayout>(R.id.rootLayout)
        button.setOnClickListener {
            viewModel.increment()
        }

        viewModel.apply{
            liveData.observe(this@MainActivity, Observer { value ->
                textView.text = value.toString()
            })

            liveDataB.observe(this@MainActivity, Observer { isEnable ->
                button.isEnabled = isEnable
            })
        }



    }
}
