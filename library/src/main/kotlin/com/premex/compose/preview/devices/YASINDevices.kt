package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YASIN device specifications for Android Compose previews.
 *
 * This extension provides YASIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YASIN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YASIN: Any
  get() = object {
      /** YASIN bangbae */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** YASIN komagome */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** YASIN shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

      /** YASIN SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** YASIN SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** YASIN umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
