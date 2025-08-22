package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wainyok device specifications for Android Compose previews.
 *
 * This extension provides Wainyok device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wainyok.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wainyok: Any
  get() = object {
      /** Wainyok P10S */
      val P10S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Wainyok P10X */
      val P10X = "spec:width=800,height=1280,unit=px,dpi=160"

  }
