package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Safaricom device specifications for Android Compose previews.
 *
 * This extension provides Safaricom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Safaricom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Safaricom: Any
  get() = object {
      /** Safaricom NEON_LITE */
      val NEON_LITE = "spec:width=480,height=800,unit=px,dpi=240"

      /** Safaricom NEON_NOVA */
      val NEON_NOVA = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Safaricom NEON_RAY */
      val NEON_RAY = "spec:width=480,height=854,unit=px,dpi=200"

      /** Safaricom NEON_RAY_2 */
      val NEON_RAY_2 = "spec:width=480,height=854,unit=px,dpi=240"

      /** Safaricom NEON_RAY_PRO */
      val NEON_RAY_PRO = "spec:width=480,height=960,unit=px,dpi=213"

      /** Safaricom Neon_Smarta_2 */
      val NEON_SMARTA_2 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Safaricom Neon_Storm */
      val NEON_STORM = "spec:width=480,height=800,unit=px,dpi=240"

      /** Safaricom Neon_Ultra_2 */
      val NEON_ULTRA_2 = "spec:width=720,height=1600,unit=px,dpi=300"

      /** Safaricom Safaricom_ET_Kimem */
      val SAFARICOM_ET_KIMEM = "spec:width=480,height=854,unit=px,dpi=213"

      /** Safaricom Sajipro */
      val SAJIPRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
