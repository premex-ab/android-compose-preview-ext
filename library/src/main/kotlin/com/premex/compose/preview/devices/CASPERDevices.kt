package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CASPER device specifications for Android Compose previews.
 *
 * This extension provides CASPER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CASPER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CASPER: Any
  get() = object {
      /** CASPER elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** CASPER R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CASPER R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CASPER R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CASPER R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CASPER R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CASPER sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CASPER SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CASPER VIA_A4 */
      val VIA_A4 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
