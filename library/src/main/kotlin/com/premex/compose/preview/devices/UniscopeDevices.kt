package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Uniscope device specifications for Android Compose previews.
 *
 * This extension provides Uniscope device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Uniscope.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Uniscope: Any
  get() = object {
      /** Uniscope S6s */
      val S6S = "spec:width=800,height=1280,unit=px,dpi=160"

  }
