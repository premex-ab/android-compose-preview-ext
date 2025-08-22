package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nothing device specifications for Android Compose previews.
 *
 * This extension provides Nothing device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nothing.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nothing: Any
  get() = object {
      /** Nothing Asteroids */
      val ASTEROIDS = "spec:width=1080,height=2392,unit=px,dpi=420"

      /** Nothing Galaga */
      val GALAGA = "spec:width=1080,height=2392,unit=px,dpi=420"

      /** Nothing Metroid */
      val METROID = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** Nothing Pacman */
      val PACMAN = "spec:width=1084,height=2412,unit=px,dpi=420"

      /** Nothing PacmanPro */
      val PACMANPRO = "spec:width=1084,height=2412,unit=px,dpi=420"

      /** Nothing Pong */
      val PONG = "spec:width=1080,height=2412,unit=px,dpi=420"

      /** Nothing Spacewar */
      val SPACEWAR = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** Nothing Tetris */
      val TETRIS = "spec:width=1080,height=2400,unit=px,dpi=420"

  }
