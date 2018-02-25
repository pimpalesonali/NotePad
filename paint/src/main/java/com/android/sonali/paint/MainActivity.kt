package com.android.sonali.paint

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

 /*   private var extraSmallBrush : Float = 0.0f
    private var smallBrush : Float = 0.0f
    private var mediumBrush : Float = 0.0f
    private var largeBrush : Float = 0.0f*/
    var drawView : DrawView? = null
    var currentPaint : ImageButton? = null
    var paintLayout : LinearLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // setContentView(DrawView(this, attrs = null))

       /* extraSmallBrush = resources.getInteger(R.integer.extra_small_size).toFloat()
        smallBrush = resources.getInteger(R.integer.small_size).toFloat()
        mediumBrush = resources.getInteger(R.integer.medium_size).toFloat()
        largeBrush = resources.getInteger(R.integer.large_size).toFloat()*/
        drawView = findViewById<DrawView>(R.id.drawView)
        paintLayout = findViewById(R.id.colorPalette)
        currentPaint = paintLayout?.getChildAt(0) as ImageButton?
        currentPaint?.setImageDrawable(resources.getDrawable(R.drawable.paint_pressed, null))
    }
    fun onDrawClick(view : View?)
    {
       // drawView?.setUpDrawing()
    }

    fun paintClicked(view : View?)
    {
        if(view != currentPaint)
        {
            var imageView : ImageView = view as ImageView
            var color : String = view.getTag().toString()
            drawView?.setColor(color)

            imageView.setImageDrawable(resources.getDrawable(R.drawable.paint_pressed, null))
            currentPaint?.setImageDrawable(resources.getDrawable(R.drawable.paint, null))
            currentPaint = view as ImageButton
        }

    }

    fun chooseBrushSize(view: View?)
    {

    }

}
