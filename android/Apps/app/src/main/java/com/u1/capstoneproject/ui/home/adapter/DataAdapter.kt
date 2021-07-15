package com.u1.capstoneproject.ui.home.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.u1.capstoneproject.data.DummyData
import com.u1.capstoneproject.databinding.RvItemBinding

class DataAdapter : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {
    private var listData = ArrayList<DummyData>()

    fun setData(data: List<DummyData>?) {
        if (data == null) return
        this.listData.clear()
        this.listData.addAll(data)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val rvItemBinding = RvItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(rvItemBinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val data = listData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = listData.size


    inner class DataViewHolder(private val binding: RvItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(data: DummyData) {
            with(binding) {
                monthYear.text = data.bulanTahun
                value.text = data.value.toString()
                valueSize.text = data.satuan
            }
        }
    }

}