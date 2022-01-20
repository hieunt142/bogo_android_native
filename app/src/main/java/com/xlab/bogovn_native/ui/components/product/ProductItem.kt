package com.xlab.bogovn_native.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.xlab.bogovn_native.ui.theme.*

@Composable
fun ProductItem() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 96.dp)
            .background(MaterialTheme.colors.background),
        elevation = 8.dp,
        shape = Shapes.medium
    ) {
        Row(
            Modifier

                .fillMaxWidth()
                .background(MaterialTheme.colors.background)
                .padding(horizontal = 24.dp, vertical = 8.dp),
            verticalAlignment = Alignment.CenterVertically
                ) {
            ProductImage(pSize = 72, pImageUrl = "https://picsum.photos/200/300", margin = 8.dp)
            Column(
                Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(horizontal = 8.dp)
            ) {
                Text(text = "Title", maxLines = 1, style = MaterialTheme.typography.h6)
                Text(text = "Price", maxLines = 1, style = MaterialTheme.typography.h6)
                UnitBox(pUnit = "KG")
            }
            Column {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.AddShoppingCart,
                        contentDescription = "Add item to cart",
                        tint = MaterialTheme.colors.primary
                    )
                }
            }
        }
    }


}


@Composable
fun ProductImage(pSize: Int, pImageUrl: String, margin : Dp = 0.dp, padding : Dp = 0.dp) {
    Box(modifier = Modifier
        .size(pSize.dp)
        .padding(margin)
        .clip(Shapes.small)
        .background(MaterialTheme.colors.surface)
        .padding(padding)
    ) {
        Image(painter = rememberImagePainter(pImageUrl), contentDescription = "Product Image")
    }

}

@Composable
fun UnitBox(pUnit : String) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp)) {
        Text(text = pUnit, maxLines = 1,
            style = MaterialTheme.typography.caption,
            modifier = Modifier
                .fillMaxWidth()
                .height(32.dp)
                .clip(Shapes.small)
                .background(MaterialTheme.colors.surface)
                .padding(6.dp)
                .align(Alignment.Center),
            textAlign = TextAlign.Center
        )
    }

}

@Preview
@Composable
private fun ProductItemPreview() {
    ProductItem()
}