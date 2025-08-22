package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * THOMSON_KODAK device specifications for Android Compose previews.
 *
 * This extension provides THOMSON_KODAK device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.THOMSONKODAK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.THOMSONKODAK: Any
  get() = object {
      /** THOMSON_KODAK LEDTV32HD */
      val LEDTV32HD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** THOMSON_KODAK LEDTVUHD */
      val LEDTVUHD = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
