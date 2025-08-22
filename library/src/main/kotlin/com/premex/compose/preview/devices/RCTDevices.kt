package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RCT device specifications for Android Compose previews.
 *
 * This extension provides RCT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RCT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RCT: Any
  get() = object {
      /** RCT MX101M2 */
      val MX101M2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
