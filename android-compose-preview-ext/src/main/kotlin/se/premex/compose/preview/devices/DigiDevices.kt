package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * DIGI device specifications for Android Compose previews.
 *
 * This extension provides DIGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digi: Any
  get() = object {
      /** DIGI Digi_C1 */
      val DIGI_C1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DIGI Digi_K1 */
      val DIGI_K1 = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** DIGI Digi_K2 */
      val DIGI_K2 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DIGI Digi_R1 */
      val DIGI_R1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DIGI DIGI_R2A */
      val DIGI_R2A = "spec:width=720,height=1280,unit=px,dpi=320"

  }
