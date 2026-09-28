package com.example.my_coffee_app.screens.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_coffee_app.R
import com.example.my_coffee_app.ui.theme.LightBrown

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WelcomeScreen(){

    Box(
        modifier = Modifier.fillMaxSize().background(color= Color.Black)
    ) {
       Image(
           painter = painterResource(id = R.drawable.image_splash),
           contentDescription = "Welcome Image"
       )

        Column(
            modifier = Modifier.fillMaxSize().padding(vertical= 70.dp , horizontal = 24.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = "Fall in Love with Coffee in Blissful Delight!",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 28.sp,
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text="Welcome to our cozy coffee corner, where every cup is delight for you. ",
                color = Color.LightGray,
                textAlign = TextAlign.Center,
                fontSize = 15.sp
            )

            Spacer(modifier = Modifier.height(50.dp))

            Button(
                onClick = {},
                modifier = Modifier.fillMaxWidth().height(50.dp),
                shape = RoundedCornerShape(10.dp),
                colors = buttonColors(
                    containerColor = LightBrown
                )
            ){
                Text(
                    text = "Get Started",
                    fontSize = 18.sp,

                )
            }
        }

    }
}