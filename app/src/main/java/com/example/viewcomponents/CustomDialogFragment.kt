package com.example.viewcomponents

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.DialogFragment
import com.example.viewcomponents.databinding.ActivityMainBinding
import com.example.viewcomponents.databinding.CustomDialogFragmentBinding


class CustomDialogFragment() : DialogFragment(){

    private lateinit var binding: CustomDialogFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var rootView: View=inflater.inflate(R.layout.custom_dialog_fragment,container,false)
        val btnCancel= rootView.findViewById<Button>(R.id.btnCancel)

        btnCancel.setOnClickListener {

            dismiss()
        }
        val btnSubmit=rootView.findViewById<Button>(R.id.btnSubmit)
        val ratingRadioGroup=rootView.findViewById<RadioGroup>(R.id.radioGroup)


        btnSubmit.setOnClickListener {
            val isSelected=ratingRadioGroup.checkedRadioButtonId
            val radio= rootView.findViewById<RadioButton>(isSelected)

            var ratingResult= radio.text.toString()
            Toast.makeText(context,"My rating: $ratingResult",Toast.LENGTH_SHORT).show()
            dismiss()
        }
        return rootView
    }
}