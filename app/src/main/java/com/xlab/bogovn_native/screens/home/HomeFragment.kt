package com.xlab.bogovn_native.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.xlab.bogovn_native.ui.components.product.ProductList


@Composable
fun HomeScreen() {
    Surface(modifier = Modifier.fillMaxSize()) {
        ProductList(items = listOf("a", "b", "c", "d"))
    }
}