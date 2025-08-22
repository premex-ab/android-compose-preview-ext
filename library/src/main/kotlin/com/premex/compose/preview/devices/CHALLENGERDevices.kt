package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHALLENGER device specifications for Android Compose previews.
 *
 * This extension provides CHALLENGER device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CHALLENGER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CHALLENGER: Any
  get() = object {
      /** CHALLENGER barking */
      val BARKING = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CHALLENGER elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** CHALLENGER lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CHALLENGER mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CHALLENGER R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CHALLENGER R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CHALLENGER R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CHALLENGER R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CHALLENGER R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** CHALLENGER stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** CHALLENGER zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
