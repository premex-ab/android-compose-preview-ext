package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * M3 device specifications for Android Compose previews.
 *
 * This extension provides M3 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.M3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.M3: Any
  get() = object {
      /** M3 M3SL20 */
      val M3SL20 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** M3 M3SL20K */
      val M3SL20K = "spec:width=480,height=800,unit=px,dpi=202"

      /** M3 M3SL20PLUS */
      val M3SL20PLUS = "spec:width=720,height=1440,unit=px,dpi=202"

      /** M3 M3SM15N */
      val M3SM15N = "spec:width=720,height=1280,unit=px,dpi=320"

      /** M3 M3SM15X */
      val M3SM15X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** M3 M3SM20 */
      val M3SM20 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** M3 M3UL20F */
      val M3UL20F = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** M3 M3UL20W */
      val M3UL20W = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** M3 M3UL20X */
      val M3UL20X = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** M3 M3US20W */
      val M3US20W = "spec:width=480,height=800,unit=px,dpi=240"

      /** M3 M3US20X */
      val M3US20X = "spec:width=480,height=800,unit=px,dpi=240"

      /** M3 M3-SL10 */
      val M3_SL10 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
