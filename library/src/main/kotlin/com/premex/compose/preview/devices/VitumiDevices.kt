package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vitumi device specifications for Android Compose previews.
 *
 * This extension provides Vitumi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vitumi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vitumi: Any
  get() = object {
      /** Vitumi TV46410B01 */
      val TV46410B01 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
