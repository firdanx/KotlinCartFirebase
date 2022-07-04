package com.example.kotlincartfirebase.listener

import com.example.kotlincartfirebase.model.CartModel

interface ICartLoadListener {
    fun onLoadCartSuccess(cartMOdelList: List<CartModel>)
    fun onLoadCartFailed(message:String?)
}