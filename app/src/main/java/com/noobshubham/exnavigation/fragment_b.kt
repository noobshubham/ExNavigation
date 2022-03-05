package com.noobshubham.exnavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.noobshubham.exnavigation.databinding.FragmentBBinding

class fragment_b : Fragment() {

    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.sendMessage.setOnClickListener {
            val message = binding.textMessage.text.toString()
            if (message.isNotEmpty()) {
                val action = fragment_bDirections.actionFragmentBToFragmentC(message)
                Navigation.findNavController(view).navigate(action)
            } else {
                Toast.makeText(context, "Please enter a mesaage", Toast.LENGTH_SHORT).show()
            }
        }
    }
}