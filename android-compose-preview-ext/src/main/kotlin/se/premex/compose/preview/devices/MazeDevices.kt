package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MAZE device specifications for Android Compose previews.
 *
 * This extension provides MAZE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maze.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maze: Any
  get() = object {
      /** MAZE Alpha */
      val ALPHA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** MAZE Alpha_X */
      val ALPHA_X = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
