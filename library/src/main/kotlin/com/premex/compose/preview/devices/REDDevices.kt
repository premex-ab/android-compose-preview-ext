package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RED device specifications for Android Compose previews.
 *
 * This extension provides RED device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RED: Any
  get() = object {
      /** RED HydrogenONE */
      val HYDROGENONE = "spec:width=1440,height=2560,unit=px,dpi=560"

  }
