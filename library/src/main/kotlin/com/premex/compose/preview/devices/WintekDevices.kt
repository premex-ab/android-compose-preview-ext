package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * WINTEK device specifications for Android Compose previews.
 *
 * This extension provides WINTEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wintek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wintek: Any
  get() = object {
      /** WINTEK W405 */
      val W405 = "spec:width=480,height=800,unit=px,dpi=213"

  }
