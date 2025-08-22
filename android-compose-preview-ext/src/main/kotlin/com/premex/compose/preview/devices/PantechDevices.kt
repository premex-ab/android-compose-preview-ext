package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pantech device specifications for Android Compose previews.
 *
 * This extension provides Pantech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Pantech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Pantech: Any
  get() = object {
      /** Pantech HS8929QC */
      val HS8929QC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
