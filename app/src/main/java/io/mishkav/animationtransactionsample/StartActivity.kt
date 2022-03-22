package io.mishkav.animationtransactionsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.ActivityOptionsCompat
import androidx.core.view.ViewCompat

class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        init()
    }

    private fun init() {
        val imageView = findViewById<View>(R.id.pacman)

        findViewById<View>(R.id.button).setOnClickListener {
            val intent = Intent(this, FinishActivity::class.java)
            val option = ViewCompat.getTransitionName(imageView)?.let { it ->
                ActivityOptionsCompat.makeSceneTransitionAnimation(this, imageView, it)
            }
            startActivity(intent, option?.toBundle())
        }
    }
}