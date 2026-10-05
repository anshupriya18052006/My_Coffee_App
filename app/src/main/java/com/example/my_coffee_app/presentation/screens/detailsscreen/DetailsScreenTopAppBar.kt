package com.example.my_coffee_app.presentation.screens.detailsscreen

import android.R.attr.clickable
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import com.example.my_coffee_app.R
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun DetailsScreenTopAppBar(navController: NavController){


    TopAppBar(
        title = { Text(text = "Details",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold) },
        actions={Icon(
            painter = painterResource(id = R.drawable.regular_outline_heart),
            contentDescription = "Add to Favourites",
            modifier = Modifier.padding(end = 12.dp)
        ) },
        navigationIcon = {

            Icon(
                painter = painterResource(id = R.drawable.regular_outline_arrow_left),
                contentDescription = "Back Button",
                modifier = Modifier.padding(start = 12.dp)
                .clickable(onClick = {navController.navigateUp()})
            )
        }
    )

}