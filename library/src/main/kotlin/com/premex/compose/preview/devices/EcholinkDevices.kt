package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Echolink device specifications for Android Compose previews.
 *
 * This extension provides Echolink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Echolink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Echolink: Any
  get() = object {
      /** Echolink shinagawa */
      val SHINAGAWA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
