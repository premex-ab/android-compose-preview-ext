package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SUXI device specifications for Android Compose previews.
 *
 * This extension provides SUXI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Suxi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Suxi: Any
  get() = object {
      /** SUXI T700 */
      val T700 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** SUXI T900 */
      val T900 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
