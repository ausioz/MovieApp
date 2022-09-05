package com.affan.movieapp.view.main.Series

import android.content.ClipData
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.affan.movieapp.R
import com.affan.movieapp.databinding.FragmentSeriesBinding
import kotlinx.android.synthetic.main.fragment_series.*

class SeriesFragment : Fragment() {

    private lateinit var binding: FragmentSeriesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSeriesBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items = listOf(
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),
            SeriesData("TEST1", "DESC1"),

        )

        val adapter = SeriesAdapter()
        binding.rvSeries.adapter = adapter
        binding.rvSeries.layoutManager = GridLayoutManager(context,2)
        adapter.setData(items)
    }
}