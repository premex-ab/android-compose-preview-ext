package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Artel device specifications for Android Compose previews.
 *
 * This extension provides Artel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Artel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Artel: Any
  get() = object {
      /** Artel ALO */
      val ALO = "spec:width=480,height=960,unit=px,dpi=240"

      /** Artel Artel_Air */
      val ARTEL_AIR = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Artel Artel_Premium */
      val ARTEL_PREMIUM = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Artel Artel_Quadro */
      val ARTEL_QUADRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Artel Artel_Quadro_Pro */
      val ARTEL_QUADRO_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** Artel Artel_T10 */
      val ARTEL_T10 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Artel Artel_Tesla */
      val ARTEL_TESLA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Artel Artel_Tomchi */
      val ARTEL_TOMCHI = "spec:width=480,height=854,unit=px,dpi=240"

      /** Artel GAPYOQ */
      val GAPYOQ = "spec:width=480,height=960,unit=px,dpi=240"

      /** Artel GAP_YOQ */
      val GAP_YOQ = "spec:width=480,height=960,unit=px,dpi=240"

      /** Artel nagai */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** Artel SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Artel U3 */
      val U3 = "spec:width=480,height=960,unit=px,dpi=240"

      /** Artel U3_4G */
      val U3_4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** Artel U4 */
      val U4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Artel U5 */
      val U5 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
