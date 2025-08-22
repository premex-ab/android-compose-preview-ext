package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Tufen device specifications for Android Compose previews.
 *
 * This extension provides Tufen device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tufen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tufen: Any
  get() = object {
      /** Tufen Q801 */
      val Q801 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
