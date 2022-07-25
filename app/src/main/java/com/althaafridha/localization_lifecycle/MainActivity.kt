package com.althaafridha.localization_lifecycle

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.althaafridha.localization_lifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

	private lateinit var binding: ActivityMainBinding

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		binding = ActivityMainBinding.inflate(layoutInflater)
		setContentView(binding.root)

		binding.button.setOnClickListener {
			startActivity(Intent(this, SecondActivity::class.java))
		}
		Log.i("Activity", "onCreate invoke")
		Toast.makeText( this,"ini toast onCreate", Toast.LENGTH_SHORT).show()

	}

	override fun onStart() {
		super.onStart()
		Log.i("Activity", "onStart invoke")
		Toast.makeText( this,"ini toast onStart", Toast.LENGTH_SHORT).show()
	}

	override fun onResume() {
		super.onResume()
		Log.i("Activity", "onResume invoke")
		Toast.makeText( this,"ini toast onResume", Toast.LENGTH_SHORT).show()
	}

	override fun onPause() {
		super.onPause()
		Log.i("Activity", "onPause invoke")
		Toast.makeText( this,"ini toast onPause", Toast.LENGTH_SHORT).show()
	}

	override fun onStop() {
		super.onStop()
		Log.i("Activity", "onStop invoke")
		Toast.makeText( this,"ini toast onStop", Toast.LENGTH_SHORT).show()
	}

	override fun onDestroy() {
		super.onDestroy()
		Log.i("Activity", "onDestroy invoke")
		Toast.makeText( this,"ini toast onDestroy", Toast.LENGTH_SHORT).show()
	}
}