package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * CONQUEST device specifications for Android Compose previews.
 *
 * This extension provides CONQUEST device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Conquest.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Conquest: Any
  get() = object {
      /** CONQUEST conquest_S16 */
      val CONQUEST_S16 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** CONQUEST conquest_S20 */
      val CONQUEST_S20 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** CONQUEST CONQUEST-S23 */
      val CONQUEST_S23 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** CONQUEST F5 */
      val F5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** CONQUEST S12Pro */
      val S12PRO = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** CONQUEST S21 */
      val S21 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
