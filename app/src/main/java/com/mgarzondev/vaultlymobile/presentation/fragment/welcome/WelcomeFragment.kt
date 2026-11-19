package com.mgarzondev.vaultlymobile.presentation.fragment.welcome

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.mgarzondev.vaultlymobile.R
import com.mgarzondev.vaultlymobile.databinding.FragmentWelcomeBinding
import com.mgarzondev.vaultlymobile.presentation.utils.setSafeOnClickListener
import com.mgarzondev.vaultlymobile.BuildConfig

class WelcomeFragment : Fragment() {

    private var _binding: FragmentWelcomeBinding? = null
    private val binding get() = _binding
    private lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentWelcomeBinding.inflate(inflater, container, false)
        navController = findNavController()

        addButtonsListeners()

        binding?.textVersion?.text = getString(R.string.version_app, BuildConfig.VERSION_NAME)

        return binding?.root
    }


    private fun addButtonsListeners() {

        binding?.loginButton?.setSafeOnClickListener {
            goToLogin()
        }

        binding?.registerButton?.setSafeOnClickListener {
            goToRegister()
        }

    }

    private fun goToLogin() {
        findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment)
    }

    private fun goToRegister() {
        findNavController().navigate(R.id.action_welcomeFragment_to_registerFragment)
    }

}