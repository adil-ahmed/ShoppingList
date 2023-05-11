package com.example.shoppinglist.ui.shoppinglist

import com.example.shoppinglist.data.db.entities.ShoppingItem

interface AddDialogListenter {
    fun onAddButtonClicked(item: ShoppingItem)
}