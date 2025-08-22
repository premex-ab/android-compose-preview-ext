package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Fplus device specifications for Android Compose previews.
 *
 * This extension provides Fplus device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Fplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Fplus: Any
  get() = object {
      /** Fplus H166 */
      val H166 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** Fplus lifetabplus */
      val LIFETABPLUS = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** Fplus P670 */
      val P670 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Fplus SA70 */
      val SA70 = "spec:width=480,height=960,unit=px,dpi=200"

  }
