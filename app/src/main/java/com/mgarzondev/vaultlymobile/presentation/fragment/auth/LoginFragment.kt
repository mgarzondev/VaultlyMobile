package com.mgarzondev.vaultlymobile.presentation.fragment.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.mgarzondev.vaultlymobile.R
import com.mgarzondev.vaultlymobile.databinding.FragmentLoginBinding
import com.mgarzondev.vaultlymobile.presentation.utils.setSafeOnClickListener
import androidx.activity.addCallback

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
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
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        navController = findNavController()


        addButtonsListeners()

        return binding?.root
    }

    private fun addButtonsListeners() {
        binding?.textRegister?.setSafeOnClickListener {
            goToRegisterPage()
        }
    }
    private fun goToRegisterPage() {
        navController.navigate(R.id.action_loginFragment_to_registerFragment)
    }

    private fun goToFirstScreen() {
        navController.navigate(R.id.action_loginFragment_to_welcomeFragment)
    }

}