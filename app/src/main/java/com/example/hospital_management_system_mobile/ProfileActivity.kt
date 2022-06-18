package com.example.hospital_management_system_mobile

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.hospital_management_system_mobile.commons.DashboardView
import com.example.hospital_management_system_mobile.commons.ViewChangeRequest
import com.example.hospital_management_system_mobile.databinding.ProfileActivityBinding
import com.example.hospital_management_system_mobile.views.AdminView
import com.example.hospital_management_system_mobile.views.DoctorView
import com.example.hospital_management_system_mobile.views.PatientView

class ProfileActivity : AppCompatActivity(), ViewChangeRequest {

    private lateinit var binding: ProfileActivityBinding

    private lateinit var login : LoginActivity
        private lateinit var doctorView : DoctorView
    private lateinit var patientView : PatientView
    private lateinit var adminView : AdminView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ProfileActivityBinding.inflate(layoutInflater)

        initComponents()

        when(login.email){
            "doctor@siu.com" ->{ onViewChange(DashboardView.DOCTOR) }
            "admin@siu.com" ->{ onViewChange(DashboardView.ADMIN) }
            "patient@siu.com" ->{ onViewChange(DashboardView.PATIENT) }
        }

        setContentView(binding.root)
    }


    private fun viewConfig(view: View) {
        binding.container.apply {
            removeAllViews()
            addView(view)
        }
    }

    private fun initComponents(){
        adminView = AdminView(this).also { it.listener = this }
        doctorView = DoctorView(this).also{ it.listener = this}
        patientView = PatientView(this).also { it.listener = this }
    }

    override fun onViewChange(dashboardView: DashboardView) {
        when(dashboardView){
            DashboardView.ADMIN -> viewConfig(adminView)
            DashboardView.DOCTOR -> viewConfig(doctorView)
            DashboardView.PATIENT -> viewConfig(patientView)
        }
    }
}