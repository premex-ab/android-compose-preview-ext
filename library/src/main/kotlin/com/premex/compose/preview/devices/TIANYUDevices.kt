package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TIANYU device specifications for Android Compose previews.
 *
 * This extension provides TIANYU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TIANYU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TIANYU: Any
  get() = object {
      /** TIANYU S40 */
      val S40 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
