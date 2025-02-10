package data.remote.generic

import extensions.assertStatus
import kotlinx.browser.window
import kotlinx.coroutines.await
import org.w3c.fetch.RequestInit
import org.w3c.fetch.Response
import kotlin.js.Json

abstract class ApiRequestInterface
{
    protected abstract val domain: String

    private suspend fun fetch(url: String, method: String, headers: Json, body: Json? = null, errorText: String): Response =
        window
            .fetch(
                input = url,
                init = RequestInit(
                    method = method,
                    body = body,
                    headers = headers
                )
            ).assertStatus(errorText)

    protected suspend fun get(url: String, headers: Json, body: Json? = null, errorText: String): Response =
        fetch(
            url = url,
            method = "GET",
            headers = headers,
            body = body,
            errorText = errorText
        )

    protected suspend fun post(url: String, headers: Json, body: Json? = null, errorText: String): Response =
        fetch(
            url = url,
            method = "POST",
            headers = headers,
            body = body,
            errorText = errorText
        )

    protected suspend fun put(url: String, headers: Json, body: Json? = null, errorText: String): Response =
        fetch(
            url = url,
            method = "PUT",
            headers = headers,
            body = body,
            errorText = errorText
        )

    protected suspend fun patch(url: String, headers: Json, body: Json? = null, errorText: String): Response =
        fetch(
            url = url,
            method = "PATCH",
            headers = headers,
            body = body,
            errorText = errorText
        )

    protected suspend fun delete(url: String, headers: Json, body: Json? = null, errorText: String): Response =
        fetch(
            url = url,
            method = "DELETE",
            headers = headers,
            body = body,
            errorText = errorText
        )

    protected suspend inline fun <reified T> toModel(response: Response): T =
        kotlinx.serialization.json.Json.decodeFromString<T>(response.text().await())
}