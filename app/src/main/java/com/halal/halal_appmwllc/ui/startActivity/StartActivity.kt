package com.halal.halal_appmwllc.ui.startActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.halal.halal_appmwllc.R

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        Handler().postDelayed({
            val intent = Intent(this, ChooseActivity::class.java)
            startActivity(intent)
            finish()
        }, 1000)

    }
}