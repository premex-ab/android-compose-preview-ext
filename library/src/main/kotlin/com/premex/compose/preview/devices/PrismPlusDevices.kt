package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PrismPlus device specifications for Android Compose previews.
 *
 * This extension provides PrismPlus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PrismPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PrismPlus: Any
  get() = object {
      /** PrismPlus anaheim */
      val ANAHEIM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PrismPlus eleonas */
      val ELEONAS = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** PrismPlus sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PrismPlus SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PrismPlus SW4H_FF */
      val SW4H_FF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PrismPlus SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PrismPlus umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
