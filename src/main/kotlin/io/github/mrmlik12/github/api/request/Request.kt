package io.github.mrmlik12.github.api.request

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request

internal class Request<T> {
    inline fun <reified T> getResponse(url: String): T {
        val response = sendRequest(url)

        return deserializeObject<T>(response)
    }

    fun sendRequest(url: String): String {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(url)
            .build()
        val response = client.newCall(request).execute()

        return response.body!!.string()
    }

    inline fun <reified T> deserializeObject(rawJson: String): T {
        return Gson().fromJson(rawJson, T::class.java)
    }
}