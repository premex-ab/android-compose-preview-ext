package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Rokid device specifications for Android Compose previews.
 *
 * This extension provides Rokid device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rokid.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rokid: Any
  get() = object {
      /** Rokid Station */
      val STATION = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Rokid station2 */
      val STATION2 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
