package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * waiputv device specifications for Android Compose previews.
 *
 * This extension provides waiputv device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Waiputv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Waiputv: Any
  get() = object {
      /** waiputv SEI700WP */
      val SEI700WP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** waiputv SEI730WP */
      val SEI730WP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** waiputv SEID00BWP */
      val SEID00BWP = "spec:width=720,height=1280,unit=px,dpi=320"

  }
