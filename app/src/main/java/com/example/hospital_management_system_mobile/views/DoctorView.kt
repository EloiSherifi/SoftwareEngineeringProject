package com.example.hospital_management_system_mobile.views

import android.content.Context
import android.view.LayoutInflater
import android.widget.FrameLayout
import com.example.hospital_management_system_mobile.commons.ViewChangeRequest
import com.example.hospital_management_system_mobile.databinding.DoctorViewBinding

class DoctorView(context: Context): FrameLayout(context) {

    private val binding = DoctorViewBinding.inflate(LayoutInflater.from(context), this, true)
    var listener: ViewChangeRequest? = null

    init {

    }
}