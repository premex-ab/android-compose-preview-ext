package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Maximus device specifications for Android Compose previews.
 *
 * This extension provides Maximus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maximus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maximus: Any
  get() = object {
      /** Maximus D1 */
      val D1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Maximus D7 */
      val D7 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Maximus G10_max */
      val G10_MAX = "spec:width=1080,height=2220,unit=px,dpi=440"

      /** Maximus Noir_X */
      val NOIR_X = "spec:width=480,height=854,unit=px,dpi=240"

      /** Maximus P2 */
      val P2 = "spec:width=480,height=960,unit=px,dpi=213"

      /** Maximus P3 */
      val P3 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Maximus P7 */
      val P7 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Maximus P7_Plus */
      val P7_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Maximus R1_Pro */
      val R1_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
