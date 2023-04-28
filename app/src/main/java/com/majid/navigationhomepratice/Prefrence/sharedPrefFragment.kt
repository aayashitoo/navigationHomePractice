package com.majid.navigationhomepratice.Prefrence

import android.content.Context
import android.content.SharedPreferences
import android.content.SharedPreferences.Editor
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.majid.navigationhomepratice.R
import com.majid.navigationhomepratice.databinding.FragmentSharedPrefBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [sharedPrefFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class sharedPrefFragment : Fragment() {
    lateinit var binding: FragmentSharedPrefBinding
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: Editor

    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSharedPrefBinding.inflate(layoutInflater)
       sharedPreferences =requireActivity().getSharedPreferences("My_Prefrences",Context.MODE_PRIVATE)
        editor=sharedPreferences.edit()
        binding.btnSave.setOnClickListener {
            editor.putString("name",binding.etemail.text.toString())
            editor.putString("password",binding.etpassword.text.toString())
            editor.apply()
        }
binding.btnshow.setOnClickListener {
val name= sharedPreferences.getString("name","")
    val password=sharedPreferences.getString("password","")
    binding.tvmessag.setText(name)
    binding.tvmespass.setText(password)
}
        return binding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment sharedPrefFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            sharedPrefFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}