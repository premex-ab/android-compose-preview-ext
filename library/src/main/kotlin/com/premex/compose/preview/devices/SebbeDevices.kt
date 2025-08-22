package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sebbe device specifications for Android Compose previews.
 *
 * This extension provides Sebbe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sebbe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sebbe: Any
  get() = object {
      /** Sebbe S22-EEA */
      val S22_EEA = "spec:width=800,height=1280,unit=px,dpi=200"

      /** Sebbe S22_T_EEA */
      val S22_T_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Sebbe S22_T_US */
      val S22_T_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
