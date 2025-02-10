package data.models

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonIgnoreUnknownKeys

@OptIn(ExperimentalSerializationApi::class)
@Serializable
@JsonIgnoreUnknownKeys
data class Repository(
    val name: String,
    val private: Boolean,
    val html_url: String,
    val description: String?,
    val created_at: String,
    val license: License?,
    val topics: List<String>
)
