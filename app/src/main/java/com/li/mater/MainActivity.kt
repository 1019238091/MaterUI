package com.li.mater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.motion.widget.MotionLayout

class MainActivity : AppCompatActivity() {

    private var motionLayout : MotionLayout? = null
    private var foldView: TextView?= null
    private var folded: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        foldView = findViewById(R.id.fold_view)
        motionLayout = findViewById<MotionLayout>(R.id.motion_layout)
        motionLayout?.setTransitionListener(object : MotionLayout.TransitionListener {
            override fun onTransitionTrigger(p0: MotionLayout?, p1: Int, p2: Boolean, p3: Float) {

            }

            override fun onTransitionStarted(p0: MotionLayout?, p1: Int, p2: Int) {

            }

            override fun onTransitionChange(p0: MotionLayout?, p1: Int, p2: Int, p3: Float) {

            }

            override fun onTransitionCompleted(p0: MotionLayout?, p1: Int) {
                folded = !folded
                if (folded) {
                    foldView?.setText(R.string.fold)
                } else {
                    foldView?.setText(R.string.collapse)
                }
            }

        })
    }

}