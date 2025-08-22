package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEWOO device specifications for Android Compose previews.
 *
 * This extension provides SEWOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SEWOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SEWOO: Any
  get() = object {
      /** SEWOO NBP_65 */
      val NBP_65 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
