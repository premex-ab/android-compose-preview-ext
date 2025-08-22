package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Htc device specifications for Android Compose previews.
 *
 * This extension provides Htc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HTC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HTC: Any
  get() = object {
      /** Htc htc_a37dj_dugl */
      val HTC_A37DJ_DUGL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Htc htc_a37_dugl */
      val HTC_A37_DUGL = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Htc htc_bre2dugl */
      val HTC_BRE2DUGL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Htc htc_bre2exdugl */
      val HTC_BRE2EXDUGL = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Htc htc_imldugl */
      val HTC_IMLDUGL = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
