package edu.temple.simplerecyclerview


import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView

// Step 3: Complete adapter implementation

class NumberDisplayAdapter (private val numbers: Array<Int>) : RecyclerView.Adapter<NumberDisplayAdapter.NumberViewHolder>() {

    class NumberViewHolder(val textView: TextView) : RecyclerView.ViewHolder (textView) {}



    //Step 3b: Complete function definitions for adapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder (TextView (parent.context).apply{
                layoutParams = ViewGroup.LayoutParams (100 , 100 ) }
        )
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.textView.setText(numbers[position].toString())
    }






}