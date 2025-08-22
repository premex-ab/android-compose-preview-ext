package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LIFE_Digital device specifications for Android Compose previews.
 *
 * This extension provides LIFE_Digital device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LifeDigital.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LifeDigital: Any
  get() = object {
      /** LIFE_Digital K3102_4G */
      val K3102_4G = "spec:width=800,height=1280,unit=px,dpi=213"

      /** LIFE_Digital K3102_W */
      val K3102_W = "spec:width=800,height=1280,unit=px,dpi=160"

  }
