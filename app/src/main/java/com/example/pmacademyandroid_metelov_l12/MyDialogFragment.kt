package com.example.pmacademyandroid_metelov_l12

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.pmacademyandroid_metelov_l12.databinding.MyDialogFragmentBinding

class MyDialogFragment : DialogFragment() {

    private lateinit var binding: MyDialogFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = MyDialogFragmentBinding.inflate(inflater, container, false)
        setupListeners()
        return binding.root
    }

    private fun setupListeners() {
        binding.btnCloseFragment.setOnClickListener {
            val me: Fragment = this
            fragmentManager?.beginTransaction()?.remove(me)?.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.MATCH_PARENT
        )
    }
}
