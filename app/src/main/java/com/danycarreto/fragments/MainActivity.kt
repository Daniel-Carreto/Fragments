package com.danycarreto.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import es.dmoral.toasty.Toasty
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DiscountEventListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(flContainer.id, DiscountFragment.newInstance(getString(R.string.app_name)))
            .commit()


        //Toast.makeText(this, "Bienvenido", Toast.LENGTH_LONG).show()

        btnDetail.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(DETAIL_PARAM,"From Discount")
            startActivity(intent)
        }

    }

    override fun showResult(result: String) {
        Toasty.success(this, "El resultado es $result", Toasty.LENGTH_LONG).show()
    }
}
