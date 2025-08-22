package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VINCENT device specifications for Android Compose previews.
 *
 * This extension provides VINCENT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vincent.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vincent: Any
  get() = object {
      /** VINCENT bruno */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** VINCENT shilin */
      val SHILIN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
