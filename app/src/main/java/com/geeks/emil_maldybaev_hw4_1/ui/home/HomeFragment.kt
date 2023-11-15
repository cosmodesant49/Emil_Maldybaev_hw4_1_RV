package com.geeks.emil_maldybaev_hw4_1.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.geeks.emil_maldybaev_hw4_1.Song
import com.geeks.emil_maldybaev_hw4_1.SongAdapter
import com.geeks.emil_maldybaev_hw4_1.databinding.FragmentHomeBinding
import com.geeks.emil_maldybaev_hw4_1.databinding.FragmentMainBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private val songList = arrayListOf(
        Song("Bon Jovi", "Its My Life"),
        Song("Зимфира", "Ромашки"),
        Song("Кипелов", "Я Свободен"),
        Song("Aerosmith", "Dream On"),
        Song("Elton John", "Im Still Standing"),
        Song("Rammstein", "Du Hast"),
        Song("Nickelback", "Savin me"),
        Song("Eminem", "Stan"),
        Song("Green Day", "Basket Case"),
        Song("Evanescence", "Bring Me To Life"),
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }
    private fun initAdapter() {
        val adapter = SongAdapter(songList)
        binding.rvSong.adapter = adapter
    }
}