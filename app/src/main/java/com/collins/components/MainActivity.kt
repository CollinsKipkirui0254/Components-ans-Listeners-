package com.collins.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myImage: ImageView= findViewById(R.id.imglambo1)
        val checkFootball : CheckBox = findViewById(R.id.checkBoxfootball)
        val checkRugby : CheckBox = findViewById(R.id.checkBoxrugby)
        val toggleWiFi: ToggleButton = findViewById(R.id.toggleButtonWiFi)
        val switchDisplayMode : Switch = findViewById(R.id.switchlightmode)
        val groupGender : RadioGroup = findViewById(R.id.groupGender)


        myImage.setOnClickListener(){
            myImage.setImageResource(R.drawable.cod)
        }

        checkFootball.setOnCheckedChangeListener{ _, ischecked ->
            if (ischecked)
            {
                Toast.makeText(this,"Football Selected", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "Football Selected",Toast.LENGTH_SHORT).show()
            }
        }

        toggleWiFi.setOnCheckedChangeListener{_, isTurnedOn ->
            if (isTurnedOn)
            {
                Toast.makeText(this,"WiFi is On", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "WiFi is Off",Toast.LENGTH_SHORT).show()
            }
        }
        
        switchDisplayMode.setOnCheckedChangeListener { _, ischecked ->
                if (ischecked)
                {
                    Toast.makeText(this,"Dark Mode is On", Toast.LENGTH_SHORT).show()
                }
                else
                {
                    Toast.makeText(this, "Dark Mode is Off",Toast.LENGTH_SHORT).show()
                }
        }

        checkRugby.setOnCheckedChangeListener { _, ischecked ->
            if (ischecked)
            {
                Toast.makeText(this,"Rugby Selected", Toast.LENGTH_SHORT).show()
            }
            else
            {
                Toast.makeText(this, "Rugby Selected",Toast.LENGTH_SHORT).show()
            }
        }

        checkRugby.isChecked
        
        groupGender.setOnCheckedChangeListener { _, id ->
            if (id == R.id.radiomale){
                Toast.makeText(this, "I am Male", Toast.LENGTH_SHORT).show()
            }
            else if (id == R.id.radiofemale){
                Toast.makeText(this, "I am Female", Toast.LENGTH_SHORT).show()
            }
            else if (id == R.id.radioOther){
                Toast.makeText(this, "I am Not Sureof my Gender",Toast.LENGTH_SHORT).show()
            }
        }

    }
}

//git init
//git add .
//git commit - m "First co"
//paste the long command
// git push -u origin master