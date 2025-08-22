package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ACCENT device specifications for Android Compose previews.
 *
 * This extension provides ACCENT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ACCENT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ACCENT: Any
  get() = object {
      /** ACCENT C5_PLUS */
      val C5_PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** ACCENT CAMELEON_C5 */
      val CAMELEON_C5 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ACCENT CAMELEON_C6 */
      val CAMELEON_C6 = "spec:width=540,height=960,unit=px,dpi=240"

      /** ACCENT FAST10 */
      val FAST10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** ACCENT FAST73G */
      val FAST73G = "spec:width=600,height=1024,unit=px,dpi=213"

      /** ACCENT FAST7_3G */
      val FAST7_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** ACCENT Pearl_A4 */
      val PEARL_A4 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ACCENT PEARL_A4_Lite */
      val PEARL_A4_LITE = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ACCENT PEARL_A4_PLUS */
      val PEARL_A4_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** ACCENT Pearl_A6 */
      val PEARL_A6 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** ACCENT TANK_P55 */
      val TANK_P55 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
