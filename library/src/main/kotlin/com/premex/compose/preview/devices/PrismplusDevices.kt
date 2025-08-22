package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Prismplus device specifications for Android Compose previews.
 *
 * This extension provides Prismplus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Prismplus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Prismplus: Any
  get() = object {
      /** Prismplus shibuya */
      val SHIBUYA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
