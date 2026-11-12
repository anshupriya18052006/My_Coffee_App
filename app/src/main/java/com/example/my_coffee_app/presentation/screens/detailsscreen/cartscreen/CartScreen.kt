package com.example.my_coffee_app.presentation.screens.detailsscreen.cartscreen

import android.R.attr.fontWeight
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.my_coffee_app.R
import com.example.my_coffee_app.domain.model.Product
import com.example.my_coffee_app.presentation.screens.navigation.Routes
import com.example.my_coffee_app.presentation.screens.theme.LightBrown
import com.example.my_coffee_app.presentation.screens.ui_components.MyBottomNavBar


@Composable
fun CartScreen(navController: NavController){
    val cartProducts = listOf(
        Product(id=1, name="Espresso", description = "Strong and rich", price = 2.99, imageRes = R.drawable.coffee_2),
        Product(id=2, name="Cappuccino", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_3),
        Product(id=3, name="Latte", description = "Creamy and milk", price = 3.99, imageRes = R.drawable.coffee_1),
    )

    var amount by remember{ mutableStateOf(12.50)}
    var deliveryFee by remember{ mutableStateOf(1.0)}

    var totalAmount by remember{ mutableStateOf(amount + deliveryFee)}

    Scaffold(
        topBar = { CartScreenTopAppBar() },
        bottomBar = {MyBottomNavBar(navController, "Cart")}
    ){
        innerPadding ->

        LazyColumn(
            modifier = Modifier
                .padding(start = 16.dp, end = 16.dp)
                .padding(innerPadding
                )
        ){
            item{
                Row(){
                    Text(
                        text = "Deliver",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = LightBrown
                    )
                }

                Spacer(modifier = Modifier.height(16.dp))

                cartProducts.forEach{product->
                    CartItemCard(product)
                }

                Spacer(modifier = Modifier.height(20.dp))

                Text(text = "Payment Summary",
                    style = MaterialTheme.typography.titleMedium.copy(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )

                Spacer(modifier = Modifier.height(8.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Price", fontSize = 18.sp)
                    Text (text = "$ $amount", fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(2.dp))

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(text = "Delivery Fee", fontSize = 18.sp)
                    Text (text = "$ $deliveryFee", fontSize = 18.sp)
                }

                Spacer(modifier = Modifier.height(16.dp))

                PaymentModeSelectionCard(totalAmount)
            }
        }
    }
}
