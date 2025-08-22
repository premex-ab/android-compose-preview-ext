package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Surfans device specifications for Android Compose previews.
 *
 * This extension provides Surfans device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Surfans.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Surfans: Any
  get() = object {
      /** Surfans K10 */
      val K10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Surfans K7 */
      val K7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Surfans K7S */
      val K7S = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Surfans Y57A */
      val Y57A = "spec:width=600,height=1024,unit=px,dpi=160"

  }
