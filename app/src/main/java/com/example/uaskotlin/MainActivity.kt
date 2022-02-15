package com.example.uaskotlin

import android.content.Intent
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import androidx.cardview.widget.CardView
import androidx.core.widget.addTextChangedListener
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView

class MainActivity : AppCompatActivity() {
    lateinit var adapter: SlideAdapter
    lateinit var sliderView: SliderView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mobile: CardView = findViewById(R.id.card1)
        val web: CardView = findViewById(R.id.card2)
        val logo: CardView = findViewById(R.id.card3)
        val threeD: CardView = findViewById(R.id.card4)
        val menu: ImageView = findViewById(R.id.threeline)
        val back: ImageView = findViewById(R.id.back)

        mobile.setOnClickListener{
            val intent = Intent(this, Mobile::class.java)
            startActivity(intent)
        }
        web.setOnClickListener{
            val intent = Intent(this, Web::class.java)
            startActivity(intent)
        }
        logo.setOnClickListener{
            val intent = Intent(this, Logo::class.java)
            startActivity(intent)
        }
        threeD.setOnClickListener{
            val intent = Intent(this, ThreeD::class.java)
            startActivity(intent)
        }
        menu.setOnClickListener{
            Toast.makeText(this, "Anda telah mengklik tombol menu", Toast.LENGTH_SHORT).show()
        }
        back.setOnClickListener{
            Toast.makeText(this, "Anda telah mengklik tombol keluar", Toast.LENGTH_SHORT).show()
        }


        val list = mutableListOf<Int>()
        list.add(R.drawable.page)
        list.add(R.drawable.page)
        list.add(R.drawable.page)


        sliderView = findViewById(R.id.image_slider)

        adapter = SlideAdapter(this, list)

        sliderView.setSliderAdapter(adapter)
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM)
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION)
        sliderView.startAutoCycle()


    }
}

