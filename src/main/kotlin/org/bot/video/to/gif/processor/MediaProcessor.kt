package org.bot.video.to.gif.processor

import org.ktypeparser.type.MediaType
import java.io.InputStream
import java.io.OutputStream

interface MediaProcessor {
    fun convert(inputStream: InputStream): OutputStream

    fun inputSupported(): List<MediaType>
    fun outputSupported(): List<MediaType>
}