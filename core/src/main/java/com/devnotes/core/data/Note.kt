package com.devnotes.core.data

/* POJO - Data structure for note */
data class Note (
    var title: String,
    var content: String,
    var creationTime: String,
    var updateTime: String,
    var id: Long = 0
)