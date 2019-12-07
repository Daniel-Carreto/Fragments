package com.danycarreto.fragments

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import es.dmoral.toasty.Toasty

const val DETAIL_PARAM:String = "detail-param"
class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val detailParam = intent.getStringExtra(DETAIL_PARAM)

        val dialog = AlertDialog.Builder(this)
        dialog.setTitle(getString(R.string.app_name))
        dialog.setMessage("Ocurrió algo en $detailParam")
        dialog.setNeutralButton("Entendido") { _, _ ->

        }
        dialog.create()
        dialog.show()
    }
}
