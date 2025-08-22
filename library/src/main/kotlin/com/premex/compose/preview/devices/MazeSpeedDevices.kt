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
      /** Maze_Speed MP5184G */
      val MP5184G = "spec:width=480,height=854,unit=px,dpi=240"

      /** Maze_Speed MS5614G */
      val MS5614G = "spec:width=480,height=960,unit=px,dpi=200"

      /** Maze_Speed SSB10T323 */
      val SSB10T323 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** Maze_Speed SSB504R */
      val SSB504R = "spec:width=480,height=854,unit=px,dpi=240"

      /** Maze_Speed SSB8C223 */
      val SSB8C223 = "spec:width=800,height=1280,unit=px,dpi=220"

      /** Maze_Speed SSB8T323 */
      val SSB8T323 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
