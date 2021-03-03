package com.example.philipplacknercourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images = listOf(
            R.drawable.anim_satoru_gojo,
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
        )

        val adapter = ViewPagerAdapter(images)
        viewPager.adapter = adapter
        // Mengatur Orientation
        viewPager.orientation = ViewPager2.ORIENTATION_VERTICAL

        //Fake Drag
        viewPager.fakeDragBy(-10F)
        viewPager.endFakeDrag()
    }
}