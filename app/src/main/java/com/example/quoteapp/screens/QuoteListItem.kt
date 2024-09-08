package com.example.quoteapp.screens



import androidx.compose.material.icons.filled.FormatQuote
import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.quoteapp.models.Quote
import com.example.quoteapp.R


@Composable
fun QuotelistItem(quote: Quote, onClick: (quote: Quote)-> Unit) {

    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        modifier = Modifier.padding(8.dp)
            .clickable { onClick(quote) }

    ) {
        Row (modifier = Modifier.padding(16.dp)){
            Image(
                imageVector = Icons.Filled.FormatQuote,
                colorFilter = ColorFilter.tint(Color.White),
                contentDescription = "",
                alignment = Alignment.TopStart,
                modifier = Modifier
                    .size(40.dp)
                    .rotate(180f)
                    .background(Color.Black)
            )

            Spacer(modifier = Modifier.padding(8.dp))

            Column(modifier = Modifier.padding(4.dp))
            {
                Text(text = quote.quote,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(0.dp,0.dp,0.dp,0.dp,)
                )


                Spacer(modifier = Modifier.padding(2.dp))

                Box(
                    modifier = Modifier
                        .fillMaxWidth(.4f)
                        .height(1.dp)
                        .background(Color(0xBABBB1B1))
                )
                Text(text =quote.author)



            }
        }


    }
}