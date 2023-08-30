package com.example.easytrip

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_ticket.*
import java.util.*

class ticket : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ticket)


        bticket.setOnClickListener {

            val parameterIntent = Intent(this, findTrip::class.java)
            startActivity(parameterIntent)

        }
        var selectDate: Button? = null
        var datePickerDialog: DatePickerDialog? = null
        var dateTxt: TextView? = null
        var dateTxt2: TextView? = null
        var calendar: Calendar? = null
        var year: Int = 0
        var month: Int = 0
        var dayOfMonth: Int = 0

        // access the items of the list
        val languages = resources.getStringArray(R.array.start_array)
        val languagess = resources.getStringArray(R.array.stop_array)

        // access the spinner
        val spinner = findViewById<Spinner>(R.id.spinner)
        if (spinner != null) {
            val adapter = ArrayAdapter(this,
                android.R.layout.simple_spinner_item, languages)
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@ticket,
                        getString(R.string.selected_item) + " " +
                                "" + languages[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
        selectDate = findViewById(R.id.selectDate)
        dateTxt = findViewById(R.id.dateTxt)
        selectDate!!.setOnClickListener {
            calendar = Calendar.getInstance()
            year = calendar!!.get(Calendar.YEAR)
            month = calendar!!.get(Calendar.MONTH)
            dayOfMonth = calendar!!.get(Calendar.DAY_OF_MONTH)
            datePickerDialog = DatePickerDialog(this@ticket,
                DatePickerDialog.OnDateSetListener { datePicker, year, month, day -> dateTxt!!.text = "$day/$month/$year" }, year, month, dayOfMonth)
            datePickerDialog!!.show()
        }

        selectDate = findViewById(R.id.selectDate2)
        dateTxt2 = findViewById(R.id.dateTxt2)
        selectDate!!.setOnClickListener {
            calendar = Calendar.getInstance()
            year = calendar!!.get(Calendar.YEAR)
            month = calendar!!.get(Calendar.MONTH)
            dayOfMonth = calendar!!.get(Calendar.DAY_OF_MONTH)
            datePickerDialog = DatePickerDialog(this@ticket,
                DatePickerDialog.OnDateSetListener { datePicker, year, month, day -> dateTxt2!!.text = "$day/$month/$year" }, year, month, dayOfMonth)
            datePickerDialog!!.show()
        }

}
}