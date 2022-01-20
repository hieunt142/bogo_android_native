package com.xlab.bogovn_native.screens.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.xlab.bogovn_native.R

class LoginActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(modifier = Modifier.fillMaxSize()) {
                LoginScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginScreen(modifier: Modifier = Modifier) {
    Box(modifier = modifier.fillMaxSize()) {
        LoginForm(modifier = modifier)
    }
}


@Composable
fun LoginForm(modifier: Modifier) {
    val emailValue = remember { mutableStateOf("")}
    val passwordValue = remember {
        mutableStateOf("")
    }
    val passwordVisibility = remember { mutableStateOf(false)}

    Column(
        modifier = modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = emailValue.value,
            onValueChange = {
                emailValue.value = it
            },
            modifier = modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 15.dp).height(56.dp),
            label = {Text(text = "Email")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = colorResource(id = R.color.purple_200),
                focusedLabelColor = colorResource(id = R.color.purple_500),
                cursorColor = colorResource(id = R.color.purple_500)
            ),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType =  KeyboardType.Email),
            leadingIcon = {
                Icon(imageVector = Icons.Default.Email, contentDescription = "Email")
            }
        )
        OutlinedTextField(
            value = passwordValue.value,
            onValueChange = {passwordValue.value = it},
            label = {Text(text = "Password")},
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = colorResource(id = R.color.purple_200),
                focusedLabelColor = colorResource(id = R.color.purple_500),
                cursorColor = colorResource(id = R.color.purple_500)
            ),
            modifier = modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 15.dp).height(56.dp),
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType =  KeyboardType.Password),
            visualTransformation = if (passwordVisibility.value) VisualTransformation.Companion.None else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(onClick = { passwordVisibility.value = !passwordVisibility.value }) {
                    Icon(imageVector = if (passwordVisibility.value) Icons.Default.Visibility else Icons.Default.VisibilityOff, contentDescription = "password")
                }
            },
            leadingIcon = {
                Icon(imageVector = Icons.Default.Lock, contentDescription = "lock")
            }
        )
        Button(onClick = { /*TODO*/ }, modifier = modifier.fillMaxWidth().padding(horizontal = 20.dp, vertical = 15.dp).height(56.dp),) {
            Text(text = "Login")
        }
    }
}

@Composable
fun LogoImage() {

}

