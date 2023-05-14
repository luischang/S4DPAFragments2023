package com.example.s4dpafragments.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.s4dpafragments.R
import com.example.s4dpafragments.ui.fragments.adapter.SongAdapter
import com.example.s4dpafragments.ui.fragments.model.SongModel


class MusicaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view: View =  inflater.inflate(R.layout.fragment_musica, container, false)

        val rvMusica: RecyclerView = view.findViewById(R.id.rvMusica)
        rvMusica.layoutManager = LinearLayoutManager(requireContext())
        rvMusica.adapter = SongAdapter(listSong())

        return view
    }

    private fun listSong(): List<SongModel>{
        val lstSong: ArrayList<SongModel> = ArrayList()

        lstSong.add(SongModel(1,R.drawable.intheend,"In the end","Album X","20,000","3:36"))
        lstSong.add(SongModel(2,R.drawable.numb,"Numb","Album X","30,000","3:46"))
        lstSong.add(SongModel(3,R.drawable.whativedone,"What I've done","Album Y","35,000","3:16"))
        lstSong.add(SongModel(4,R.drawable.onestepcloser,"One step closer","Album Z","55,000","3:20"))
        lstSong.add(SongModel(5,R.drawable.castleofglass,"Castle of Glass","Album P","75,000","3:52"))

        return lstSong
    }

}