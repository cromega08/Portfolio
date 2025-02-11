package utils

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import enums.Languages
import enums.StringValues

class StringResources
{
    var language: Languages by mutableStateOf(Languages.ENGLISH)
    private val values: Map<String, StringValues> = StringValues.toMap()

    fun get(key: String): String =
        values[key]
            .runCatching {
                when(language) {
                    Languages.ENGLISH -> this!!.english
                    Languages.SPANISH -> this!!.spanish
                }
            }.getOrDefault("")
}