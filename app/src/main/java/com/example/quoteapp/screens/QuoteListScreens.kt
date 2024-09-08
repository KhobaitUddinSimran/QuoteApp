package com.example.quoteapp.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.style.TextAlign
import com.example.quoteapp.models.Quote
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.example.quoteapp.R

@Composable
fun QuoteListScreen(data: Array<Quote>, onCLick : (quote: Quote)-> Unit){
    Column {
        Text(text = "Quotes App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxSize(1f),
            fontFamily = FontFamily(Font(R.font.montserrat_regular)),
            style = MaterialTheme.typography.headlineMedium
        )
        QuoteList(data = data,onCLick)
    }
}