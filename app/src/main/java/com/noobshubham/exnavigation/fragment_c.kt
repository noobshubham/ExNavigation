package com.noobshubham.exnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.navArgs
import com.noobshubham.exnavigation.databinding.FragmentBBinding
import com.noobshubham.exnavigation.databinding.FragmentCBinding
import com.noobshubham.exnavigation.databinding.FragmentMainBinding

class fragment_c : Fragment() {

    private val args: fragment_cArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
         val view = inflater.inflate(R.layout.fragment_c, container, false)

        val textMessage = args.message
        val tv: TextView = view.findViewById(R.id.message_text)
        tv.text = textMessage

        return view
    }
}