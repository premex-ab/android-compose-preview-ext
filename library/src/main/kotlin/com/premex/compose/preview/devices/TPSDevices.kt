package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TPS device specifications for Android Compose previews.
 *
 * This extension provides TPS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TPS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TPS: Any
  get() = object {
      /** TPS K1091F */
      val K1091F = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** TPS TPS-SC10 */
      val TPS_SC10 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
