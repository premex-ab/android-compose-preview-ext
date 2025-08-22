package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maze_Speed device specifications for Android Compose previews.
 *
 * This extension provides Maze_Speed device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MazeSpeed.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MazeSpeed: Any
  get() = object {
      /** DeviceSpec(manufacturer=Maze_Speed, code=MP5184G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maze_Speed, code=MP5184G,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val MP5184G = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maze_Speed, code=MS5614G, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maze_Speed, code=MS5614G,
      width=480, height=960, dpi=200, isGoogleDevice=false).code */
      val MS5614G = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Maze_Speed, code=SSB10T323, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maze_Speed, code=SSB10T323,
      width=800, height=1280, dpi=220, isGoogleDevice=false).code */
      val SSB10T323 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Maze_Speed, code=SSB504R, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maze_Speed, code=SSB504R,
      width=480, height=854, dpi=240, isGoogleDevice=false).code */
      val SSB504R = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Maze_Speed, code=SSB8C223, width=800, height=1280, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maze_Speed, code=SSB8C223,
      width=800, height=1280, dpi=220, isGoogleDevice=false).code */
      val SSB8C223 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=Maze_Speed, code=SSB8T323, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maze_Speed, code=SSB8T323,
      width=800, height=1280, dpi=240, isGoogleDevice=false).code */
      val SSB8T323 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
