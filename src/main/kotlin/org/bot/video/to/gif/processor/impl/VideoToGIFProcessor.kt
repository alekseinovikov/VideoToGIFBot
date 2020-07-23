package org.bot.video.to.gif.processor.impl

import org.bot.video.to.gif.processor.MediaProcessor
import org.ktypeparser.type.MediaType
import java.io.InputStream
import java.io.OutputStream

internal class VideoToGIFProcessor : MediaProcessor {

    private val outputTypes = listOf(MediaType.GIF)
    private val inputTypes = listOf(MediaType.MP4_VIDEO)

    override fun inputSupported() = inputTypes
    override fun outputSupported() = outputTypes

    override fun convert(inputStream: InputStream): OutputStream {
        return OutputStream.nullOutputStream();
    }

}
