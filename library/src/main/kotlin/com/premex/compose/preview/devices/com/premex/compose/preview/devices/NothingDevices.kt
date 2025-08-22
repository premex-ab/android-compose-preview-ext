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
      /** DeviceSpec(manufacturer=Nothing, code=Asteroids, width=1080, height=2392, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nothing, code=Asteroids,
      width=1080, height=2392, dpi=420, isGoogleDevice=false).code */
      val ASTEROIDS = "spec:width=1080,height=2392,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Nothing, code=Galaga, width=1080, height=2392, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nothing, code=Galaga, width=1080,
      height=2392, dpi=420, isGoogleDevice=false).code */
      val GALAGA = "spec:width=1080,height=2392,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Nothing, code=Metroid, width=1260, height=2800, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nothing, code=Metroid, width=1260,
      height=2800, dpi=480, isGoogleDevice=false).code */
      val METROID = "spec:width=1260,height=2800,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Nothing, code=Pacman, width=1084, height=2412, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nothing, code=Pacman, width=1084,
      height=2412, dpi=420, isGoogleDevice=false).code */
      val PACMAN = "spec:width=1084,height=2412,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Nothing, code=PacmanPro, width=1084, height=2412, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nothing, code=PacmanPro,
      width=1084, height=2412, dpi=420, isGoogleDevice=false).code */
      val PACMANPRO = "spec:width=1084,height=2412,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Nothing, code=Pong, width=1080, height=2412, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nothing, code=Pong, width=1080,
      height=2412, dpi=420, isGoogleDevice=false).code */
      val PONG = "spec:width=1080,height=2412,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Nothing, code=Spacewar, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nothing, code=Spacewar, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val SPACEWAR = "spec:width=1080,height=2400,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=Nothing, code=Tetris, width=1080, height=2400, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nothing, code=Tetris, width=1080,
      height=2400, dpi=420, isGoogleDevice=false).code */
      val TETRIS = "spec:width=1080,height=2400,unit=px,dpi=420"

  }
