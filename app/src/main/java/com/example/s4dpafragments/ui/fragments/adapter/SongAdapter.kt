package com.example.s4dpafragments.ui.fragments.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.s4dpafragments.R
import com.example.s4dpafragments.ui.fragments.model.SongModel

class SongAdapter(var lstSong: List<SongModel>)
    : RecyclerView.Adapter<SongAdapter.ViewHolder>() {

    class ViewHolder(itemView: View)
        : RecyclerView.ViewHolder(itemView){
            val ivSong: ImageView = itemView.findViewById(R.id.ivSong)
            val tvSong: TextView = itemView.findViewById(R.id.tvSong)
            val tvAlbum: TextView = itemView.findViewById(R.id.tvAlbum)
            val tvCountViews: TextView = itemView.findViewById(R.id.tvCountViews)
            val tvSongTime: TextView = itemView.findViewById(R.id.tvSongTime)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_musica,parent,false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemSong = lstSong[position]
        holder.ivSong.setImageResource(itemSong.image)
        holder.tvSong.text = itemSong.songName
        holder.tvAlbum.text = itemSong.album
        holder.tvCountViews.text = itemSong.countViews
        holder.tvSongTime.text = itemSong.songTime
    }

    override fun getItemCount(): Int {
        return lstSong.size
    }
}