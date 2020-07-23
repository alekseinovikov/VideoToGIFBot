package org.bot.video.to.gif.helper

import java.nio.file.Path
import java.nio.file.Paths

private val tempDirProperty: String by lazy { System.getProperty("java.io.tmpdir") }

val tempDir: Path by lazy { Paths.get(tempDirProperty) }