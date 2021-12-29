package com.example.minecraftsounds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FragmentSoundLibrary : Fragment(), View.OnClickListener{

    private var array: Array<String> = arrayOf("Calm1", "Calm2", "Calm3", "Hal1", "Hal2", "Hal3", "Hal4")
    private var adapter: CustomAdapterMainFolders = CustomAdapterMainFolders(array)
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sound_library, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.rvSoundLibrary) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = adapter

        val btnMusic: ImageButton = view.findViewById(R.id.btnMusic)
        val btnAmbient: ImageButton = view.findViewById(R.id.btnAmbient)
        val btnHostileMobs: ImageButton = view.findViewById(R.id.btnHostileMobs)
        val btnPacificMobs: ImageButton = view.findViewById(R.id.btnPacificMobs)

        btnMusic.setOnClickListener(this)
        btnAmbient.setOnClickListener(this)
        btnHostileMobs.setOnClickListener(this)
        btnPacificMobs.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btnMusic -> {
                array = arrayOf("Calm1", "Calm2", "Calm3", "Hal1", "Hal2", "Hal3", "Hal4")
            }
            R.id.btnAmbient -> {
                array = arrayOf("Ambient 1", "Ambient 2")
            }
            R.id.btnHostileMobs -> {
                array = arrayOf("HMob 1", "HMob 2")
            }
            R.id.btnPacificMobs -> {
                array = arrayOf("PMob 1", "PMob 2")
            }
        }
        adapter = CustomAdapterMainFolders(array)
        recyclerView.adapter = adapter
    }

}