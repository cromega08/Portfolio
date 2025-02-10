package extensions

import kotlinx.browser.window
import kotlinx.coroutines.await
import org.w3c.fetch.Response
import kotlin.js.Promise

suspend fun Promise<Response>.assertStatus(failText: String) =
    await()
        .apply {
            status
                .toInt()
                .also {
                    check(200 == it || 0 == it) {
                        failText.also { message ->
                            console.log(message)
                            window.alert(message)
                        }
                    }
                }
        }