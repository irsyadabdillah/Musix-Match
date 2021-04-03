package com.irzstudio.musicmatch.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.irzstudio.musicmatch.R
import com.irzstudio.musicmatch.dataartist.ArtistDetailResponse
import kotlinx.android.synthetic.main.item_listofartist.view.*

class ArtistAdapter(private val list: ArrayList<ArtistDetailResponse>) :
    RecyclerView.Adapter<ArtistAdapter.ArtistDetailViewHolder>() {
    inner class ArtistDetailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(artistDetailResponse: ArtistDetailResponse) {

            itemView.tv_nameartist.text = artistDetailResponse.artist_name
            itemView.tv_idartist.text = artistDetailResponse.artist_id.toString()
            itemView.tv_countryartist.text = artistDetailResponse.artist_country


            if (adapterPosition % 2 == 0){
                itemView.setBackgroundColor(itemView.context.resources.getColor(R.color.white))

            }else{
                itemView.setBackgroundColor(itemView.context.resources.getColor(R.color.colorBackground))
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistDetailViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_listofartist,parent, false)
        return ArtistDetailViewHolder(view)

    }

    override fun onBindViewHolder(holder: ArtistDetailViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }
}