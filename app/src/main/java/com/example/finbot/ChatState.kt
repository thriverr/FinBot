package com.example.finbot

import android.graphics.Bitmap
import com.example.finbot.Data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
