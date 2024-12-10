package com.diegofer.app

import com.codanbaru.serialization.Dynamap
import com.codanbaru.serialization.format.encodeToItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Book(
    @SerialName("BookName")
    val name: String,

    val author: String?,
    val price: Int
)

class Main {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val book = Book("Harry Potter", "JKRowling", 10)

            val item = Dynamap.encodeToItem(book)

            println(item)
        }
    }
}
