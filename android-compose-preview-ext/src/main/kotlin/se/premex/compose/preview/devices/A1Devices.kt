package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * A1 device specifications for Android Compose previews.
 *
 * This extension provides A1 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.A1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.A1: Any
  get() = object {
      /** A1 DV9161-KBA */
      val DV9161_KBA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** A1 P671F60 */
      val P671F60 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** A1 P963F01D */
      val P963F01D = "spec:width=720,height=1520,unit=px,dpi=320"

      /** A1 VFD720 */
      val VFD720 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
