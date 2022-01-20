package com.xlab.bogovn_native.ui.components.product

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.xlab.bogovn_native.ui.components.ProductItem

@Composable
fun ProductList(items : List<String> ,modifier : Modifier = Modifier) {
    LazyColumn {
        items(items) {
            ProductItem()
        }
    }
}