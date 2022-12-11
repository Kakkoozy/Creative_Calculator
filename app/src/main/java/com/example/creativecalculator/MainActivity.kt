package com.example.creativecalculator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.example.creativecalculator.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    val dropdownlist1 = arrayOf("Ignis", "Aqua", "Lux", "Umbra")
    val dropdownlist2 = arrayOf("Fulmen", "Triplex Fulmen", "Fluctus", "Gladius")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist1)
        val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, dropdownlist2)
        val bottomSheetFragment = BottomSheetFragment()
        button2.setOnClickListener {
            bottomSheetFragment.show(supportFragmentManager,"Bottomsheetdialog")
        }




        var b1 = findViewById(R.id.button) as Button



        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_item)



        elements1.adapter = adapter
        elements1.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (elements1.selectedItemPosition == 0) {
                    textView.setText(" " + elements1.selectedItem)

                }
                if (elements1.selectedItemPosition == 1) {
                    textView.setText(" " + elements1.selectedItem)

                }
                if (elements1.selectedItemPosition == 2) {
                    textView.setText(" " + elements1.selectedItem)

                }
                if (elements1.selectedItemPosition == 3) {
                    textView.setText(" " + elements1.selectedItem)

                }
            }
        }

        elements2.adapter = adapter2
        elements2.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
            }

            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (elements2.selectedItemPosition == 0) {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if (elements2.selectedItemPosition == 1) {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if (elements2.selectedItemPosition == 2) {
                    textView2.setText(" " + elements2.selectedItem)

                }
                if (elements2.selectedItemPosition == 3) {
                    textView2.setText(" " + elements2.selectedItem)

                }
            }
        }

        b1.setOnClickListener {
            if (elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 0) {
                textView3.setText("Your spell is: Fire Bolt")
            }
            if (elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 1) {
                textView3.setText("Your spell is: Triple Fire Bolt")
            }

            if (elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 2) {
                textView3.setText("Your spell is: Fire Wave")
            }

            if (elements1.selectedItemPosition == 0 && elements2.selectedItemPosition == 3) {
                textView3.setText("Your spell is Fire Sword")
            }
            if (elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 0) {
                textView3.setText("Your spell is: Water Bolt")
            }
            if (elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 1) {
                textView3.setText("Your spell is: Triple Water Bolt")
            }

            if (elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 2) {
                textView3.setText("Your spell is: Water Wave")
            }

            if (elements1.selectedItemPosition == 1 && elements2.selectedItemPosition == 3) {
                textView3.setText("Your spell is Water Sword")
            }
            if (elements1.selectedItemPosition == 2 && elements2.selectedItemPosition == 0) {
                textView3.setText("Your spell is: Light Bolt")
            }
            if (elements1.selectedItemPosition == 2 && elements2.selectedItemPosition == 1) {
                textView3.setText("Your spell is: Triple Light Bolt")
            }

            if (elements1.selectedItemPosition == 2 && elements2.selectedItemPosition == 2) {
                textView3.setText("Your spell is: Light Wave")
            }

            if (elements1.selectedItemPosition == 2 && elements2.selectedItemPosition == 3) {
                textView3.setText("Your spell is Light Sword")
            }
            if (elements1.selectedItemPosition == 3 && elements2.selectedItemPosition == 0) {
                textView3.setText("Your spell is: Shadow Bolt")
            }
            if (elements1.selectedItemPosition == 3 && elements2.selectedItemPosition == 1) {
                textView3.setText("Your spell is: Triple Shadow Bolt")
            }

            if (elements1.selectedItemPosition == 3 && elements2.selectedItemPosition == 2) {
                textView3.setText("Your spell is: Shadow Wave")
            }

            if (elements1.selectedItemPosition == 3 && elements2.selectedItemPosition == 3) {
                textView3.setText("Your spell is Shadow Sword")
            }

        }
    }
}
