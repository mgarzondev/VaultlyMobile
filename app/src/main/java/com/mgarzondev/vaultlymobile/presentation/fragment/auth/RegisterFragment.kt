package com.mgarzondev.vaultlymobile.presentation.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import com.mgarzondev.vaultlymobile.R
import com.mgarzondev.vaultlymobile.databinding.FragmentRegisterBinding
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get() = _binding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requireActivity().onBackPressedDispatcher.addCallback(this) {
            goToFirstScreen()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        navController = findNavController()

        return binding?.root
    }

    private fun goToFirstScreen() {
        navController.navigate(R.id.action_registerFragment_to_welcomeFragment)
    }

}