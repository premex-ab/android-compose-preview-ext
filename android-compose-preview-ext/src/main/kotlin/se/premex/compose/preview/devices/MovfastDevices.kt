package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Movfast device specifications for Android Compose previews.
 *
 * This extension provides Movfast device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Movfast.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Movfast: Any
  get() = object {
      /** Movfast MFT1522 */
      val MFT1522 = "spec:width=720,height=1440,unit=px,dpi=280"

      /** Movfast MFT1621 */
      val MFT1621 = "spec:width=480,height=800,unit=px,dpi=220"

  }
