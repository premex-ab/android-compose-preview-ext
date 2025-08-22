package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KALLEY device specifications for Android Compose previews.
 *
 * This extension provides KALLEY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kalley.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kalley: Any
  get() = object {
      /** KALLEY R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KALLEY R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** KALLEY R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KALLEY R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KALLEY R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KALLEY R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KALLEY R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KALLEY SILVER_MAX */
      val SILVER_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

  }
