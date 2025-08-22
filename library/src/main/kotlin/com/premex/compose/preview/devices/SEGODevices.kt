package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEGO device specifications for Android Compose previews.
 *
 * This extension provides SEGO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SEGO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SEGO: Any
  get() = object {
      /** SEGO S24 */
      val S24 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** SEGO S25_Neo */
      val S25_NEO = "spec:width=720,height=1600,unit=px,dpi=272"

      /** SEGO S_PAD */
      val S_PAD = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SEGO ZERO_50 */
      val ZERO_50 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
