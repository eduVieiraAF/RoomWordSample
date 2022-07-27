package com.example.roomwordsample

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(tableName = "word_table")
data class Word(
    @ColumnInfo(name = "word") val word: String,
)