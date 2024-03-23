package com.veasta.noteapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.veasta.noteapp.databinding.FragmentLoginBinding
import com.veasta.noteapp.databinding.FragmentRegistrationBinding
import com.veasta.noteapp.models.UserRequest
import com.veasta.noteapp.viewmodel.AuthViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationFragment : Fragment() {
    private var _binding : FragmentRegistrationBinding? = null
    private val binding get() = _binding!!
    private val authViewModel by viewModels<AuthViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentRegistrationBinding.inflate(inflater,container,false)
        binding.btnSignUp.setOnClickListener{
            authViewModel.registerUser(UserRequest("test11@gmail.com","12345","test11"))
//            findNavController().navigate(R.id.action_registrationFragment_to_mainFragment)
        }
        binding.btnLogin.setOnClickListener {
            authViewModel.loginUser(UserRequest("test@gmail.com","12345","test"))
//            findNavController().navigate(R.id.action_registrationFragment_to_loginFragment)
        }
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}