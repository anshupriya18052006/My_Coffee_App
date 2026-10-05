package com.example.my_coffee_app.presentation.screens.detailsscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.my_coffee_app.presentation.screens.theme.CharcoalGray
import com.example.my_coffee_app.presentation.screens.theme.LightBrown
import com.example.my_coffee_app.presentation.screens.theme.LightGray


@Composable
fun SelectSizeChip(sizeText: String, selected: Boolean, onClick: () -> Unit, modifier : Modifier){


        Box(

            modifier = modifier
                .background(
                    color = if (selected) LightBrown else Color.White,
                    shape = RoundedCornerShape(12.dp))
                .border(1.dp,
                    color = if (selected) Color(0xFFC67C4E) else Color(0xFFE1E1E1),
                    shape = RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .height(46.dp)
            .clickable{onClick},
            contentAlignment = Alignment.Center

        ){
            Text(
                text = sizeText,
                fontSize = 16.sp,
                fontWeight= FontWeight.SemiBold,
                color = if (selected) LightBrown else CharcoalGray
            )
        }



}