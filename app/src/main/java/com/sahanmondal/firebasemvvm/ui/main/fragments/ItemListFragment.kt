package com.sahanmondal.firebasemvvm.ui.main.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.sahanmondal.firebasemvvm.R
import kotlinx.android.synthetic.main.fragment_item_list.*

class ItemListFragment : Fragment(R.layout.fragment_item_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fab.setOnClickListener {
            findNavController().navigate(
                ItemListFragmentDirections.actionItemListFragmentToAddItemFragment()
            )
        }
    }
}