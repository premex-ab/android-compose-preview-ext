package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Ciontek device specifications for Android Compose previews.
 *
 * This extension provides Ciontek device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ciontek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ciontek: Any
  get() = object {
      /** Ciontek CS20 */
      val CS20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Ciontek CS30 */
      val CS30 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Ciontek CS50 */
      val CS50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Ciontek CS50C */
      val CS50C = "spec:width=720,height=1440,unit=px,dpi=320"

  }
