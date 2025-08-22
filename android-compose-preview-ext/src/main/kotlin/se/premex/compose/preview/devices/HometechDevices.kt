package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Hometech device specifications for Android Compose previews.
 *
 * This extension provides Hometech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hometech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hometech: Any
  get() = object {
      /** Hometech Alfa10LT */
      val ALFA10LT = "spec:width=800,height=1280,unit=px,dpi=180"

      /** Hometech ALFA10MX */
      val ALFA10MX = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Hometech Alfa_11_BT */
      val ALFA_11_BT = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** Hometech Alfa_12_GX_Pro */
      val ALFA_12_GX_PRO = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** Hometech ALFA_7M */
      val ALFA_7M = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Hometech HT_8MZ */
      val HT_8MZ = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hometech mid1032_mr_32 */
      val MID1032_MR_32 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Hometech mid7015_32 */
      val MID7015_32 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
