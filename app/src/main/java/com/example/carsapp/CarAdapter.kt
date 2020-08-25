package com.example.carsapp

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class CarAdapter (var mCtx:Context, var resources:Int, var items:List<Model>) :ArrayAdapter<Model> (mCtx, resources, items)  {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view:View = LayoutInflater.from(mCtx).inflate(resources, null)
        view.setOnClickListener{ Toast.makeText( mCtx, items[position].message, Toast.LENGTH_SHORT).show()}


        val imageView:ImageView = view.findViewById(R.id.image)
        val titleTextView:TextView = view.findViewById(R.id.textView1)
        val descriptionTextView:TextView = view.findViewById(R.id.textView2)

        var mItem: Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.img))
        titleTextView.text = mItem.title
        descriptionTextView.text = mItem.description

        return view
    }
}

