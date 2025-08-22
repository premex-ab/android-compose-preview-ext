package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GlocalMe device specifications for Android Compose previews.
 *
 * This extension provides GlocalMe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Glocalme.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Glocalme: Any
  get() = object {
      /** GlocalMe P3S18 */
      val P3S18 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** GlocalMe S20iQ19 */
      val S20IQ19 = "spec:width=1080,height=2280,unit=px,dpi=480"

  }
