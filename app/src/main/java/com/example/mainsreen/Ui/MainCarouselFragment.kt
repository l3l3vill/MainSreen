package com.example.mainsreen.Ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mainsreen.Projet

import com.example.mainsreen.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_carousel_fragment.*

class MainCarouselFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_carousel_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //viewModel = ViewModelProviders.of(this).get(MainCarouselViewModel::class.java)
        // TODO: Use the ViewModel
        carouselview_main.initialize(mainCarouselAdapter)
        //mainCarouselAdapter.remove(projets[position])
        mainCarouselAdapter.setProjets(projets)
        //mainCarouselAdapter.removeView(projets)

    }

    private val mainCarouselAdapter by lazy{//lazy: inicia la primer vez que se hace uso de la variable
        MainCarouselAdapter{ position: Int,projet: Projet ->
            carouselview_main.smoothScrollToPosition(position)
        }}

    private val projets: MutableList <Projet> = mutableListOf(
        Projet(R.drawable.social,R.drawable.givecoin,true,R.drawable.megaphonegreen,R.drawable.projetimage,R.string.projet_du_jour,1.0),
        Projet(R.drawable.social,R.drawable.givecoin,false,R.drawable.megaphonegreen,R.drawable.projetimage,R.string.projet_du_jour,0.5),
        Projet(R.drawable.social,R.drawable.givecoin,true,R.drawable.megaphonegreen,R.drawable.projetimage,R.string.projet_du_jour, 0.5),
        Projet(R.drawable.social,R.drawable.givecoin,true,R.drawable.megaphonegreen,R.drawable.projetimage,R.string.projet_du_jour,1.0),
        Projet(R.drawable.social,R.drawable.givecoin,false, R.drawable.megaphonegreen,R.drawable.projetimage,R.string.projet_du_jour,1.0)


    )

}
