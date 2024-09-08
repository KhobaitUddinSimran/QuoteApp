package com.example.quoteapp.screens



import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.items
import com.example.quoteapp.models.Quote

@Composable
fun QuoteList(data:Array<Quote>, onClick:(quote:Quote)->Unit) {

    LazyColumn(content = {
        items(data){
            QuotelistItem(quote = it,  onClick)
        }
    })
}
