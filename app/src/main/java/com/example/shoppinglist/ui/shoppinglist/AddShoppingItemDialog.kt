package com.example.shoppinglist.ui.shoppinglist

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatDialog
import com.example.shoppinglist.data.db.entities.ShoppingItem
import kotlinx.android.synthetic.main.dialog_add_shopping_item.*

class AddShoppingItemDialog(context: Context, var addDialogListenter: AddDialogListenter): AppCompatDialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tvAdd.setOnClickListener {
            val name = etName.text.toString()
            val amount = etAmount.text.toString()

            if(name.isEmpty() || amount.isEmpty())
            {
                Toast.makeText(context, "Please insert all the information", Toast.LENGTH_SHORT).show()
                return@setOnClickListener

            }
            val item = ShoppingItem(name, amount.toInt())
            addDialogListenter.onAddButtonClicked(item)
            dismiss()
        }

        tvCancel.setOnClickListener{
            cancel()
        }
    }
}