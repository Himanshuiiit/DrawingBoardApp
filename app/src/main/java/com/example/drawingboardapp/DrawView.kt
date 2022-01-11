package com.example.drawingboardapp

import android.content.Context
import android.graphics.*
import android.util.AttributeSet
import android.view.View

class DrawView(context: Context,attribute: AttributeSet) : View(context,attribute) {
    private var mDrawPath: CustomPath? = null
    private var mCanvasBitMap: Bitmap? = null
    private var mDrawPaint: Paint? = null
    private var mCanvasPaint: Paint? = null
    private var mBrushSize:Float = 0.toFloat()
    private var color = Color.BLACK
    private var canvas: Canvas? = null

    init {
        setupDrawing()
    }
    private fun setupDrawing(){
        mDrawPaint = Paint()
        mDrawPath = CustomPath(color,mBrushSize)
        mDrawPaint!!.color = color
        mDrawPaint!!.style = Paint.Style.STROKE
        mDrawPaint!!.strokeJoin = Paint.Join.ROUND
        mDrawPaint!!.strokeCap = Paint.Cap.ROUND
        mCanvasPaint = Paint(Paint.DITHER_FLAG)
        mBrushSize = 20.toFloat()
    }

    internal inner class CustomPath(var color: Int,var brushThickness: Float): Path(){

    }
}