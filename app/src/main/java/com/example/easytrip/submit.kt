package com.example.easytrip

import android.app.DatePickerDialog
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_submit.*
import kotlinx.android.synthetic.main.activity_ticket.*
import java.util.*

class submit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_submit)

        buttonsend.setOnClickListener {

            val intent = Intent(
                Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto", "amiry.f001@gmail.com", null
                )
            )
            intent.putExtra(Intent.EXTRA_SUBJECT, "subject")
            intent.putExtra(Intent.EXTRA_TEXT, "message")
            startActivity(Intent.createChooser(intent, "Choose an Email client :"))
        }

        var selectDate: TextView? = null
        var datePickerDialog: DatePickerDialog? = null
        var dateTxt: TextView? = null
        var calendar: Calendar? = null
        var year: Int = 0
        var month: Int = 0
        var dayOfMonth: Int = 0

        selectDate = findViewById(R.id.textView52)
        dateTxt = findViewById(R.id.textView53)
        selectDate!!.setOnClickListener {
            calendar = Calendar.getInstance()
            year = calendar!!.get(Calendar.YEAR)
            month = calendar!!.get(Calendar.MONTH)
            dayOfMonth = calendar!!.get(Calendar.DAY_OF_MONTH)
            datePickerDialog = DatePickerDialog(this@submit,
                DatePickerDialog.OnDateSetListener { datePicker, year, month, day -> dateTxt!!.text = "$day/$month/$year" }, year, month, dayOfMonth)
            datePickerDialog!!.show()
        }


        val languages = resources.getStringArray(R.array.country_array)

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
                    Toast.makeText(this@submit,
                        getString(R.string.selected_item) + " " +
                                "" + languages[position], Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }
            }
        }
    }
}