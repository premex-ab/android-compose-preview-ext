package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KRIP device specifications for Android Compose previews.
 *
 * This extension provides KRIP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Krip.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Krip: Any
  get() = object {
      /** KRIP K4b */
      val K4B = "spec:width=480,height=800,unit=px,dpi=240"

      /** KRIP K4m */
      val K4M = "spec:width=480,height=800,unit=px,dpi=240"

      /** KRIP K5 */
      val K5 = "spec:width=480,height=854,unit=px,dpi=240"

      /** KRIP K50 */
      val K50 = "spec:width=480,height=854,unit=px,dpi=200"

      /** KRIP K51 */
      val K51 = "spec:width=480,height=854,unit=px,dpi=200"

      /** KRIP K55g */
      val K55G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KRIP K55h */
      val K55H = "spec:width=480,height=960,unit=px,dpi=240"

      /** KRIP K57 */
      val K57 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KRIP K58 */
      val K58 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KRIP K58b */
      val K58B = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KRIP K5b */
      val K5B = "spec:width=720,height=1280,unit=px,dpi=320"

      /** KRIP K5c */
      val K5C = "spec:width=540,height=960,unit=px,dpi=240"

      /** KRIP K5d */
      val K5D = "spec:width=480,height=854,unit=px,dpi=240"

      /** KRIP K5m */
      val K5M = "spec:width=480,height=854,unit=px,dpi=240"

      /** KRIP K6 */
      val K6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** KRIP K60 */
      val K60 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KRIP K65 */
      val K65 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** KRIP K66 */
      val K66 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** KRIP K68 */
      val K68 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** KRIP K69 */
      val K69 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** KRIP K6b */
      val K6B = "spec:width=480,height=960,unit=px,dpi=213"

      /** KRIP KRIP_K4 */
      val KRIP_K4 = "spec:width=480,height=800,unit=px,dpi=240"

      /** KRIP KRIP_K55 */
      val KRIP_K55 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** KRIP KRIP_K700A */
      val KRIP_K700A = "spec:width=480,height=960,unit=px,dpi=240"

  }
