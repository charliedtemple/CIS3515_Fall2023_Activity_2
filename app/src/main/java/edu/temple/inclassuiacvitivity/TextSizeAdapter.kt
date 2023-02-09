package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context: Context, _textSizes: Array<Int>) : BaseAdapter(){
    val context = _context
    val textSizes = _textSizes

    override fun getCount(): Int {
        return textSizes.size
    }

    override fun getItem(position: Int): Any {
        return textSizes[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        return (getDropDownView(position, convertView, parent) as TextView).apply { textSize = 22f  }
    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView: TextView
        if(convertView == null){
            textView = TextView(context)
            textView.setPadding(10,20,0,20)
        } else {
            textView = convertView as TextView
        }
        textView.textSize = textSizes[position].toFloat()
        textView.text = textSizes[position].toString()
        return textView
        //return super.getDropDownView(position, convertView, parent)
    }

}