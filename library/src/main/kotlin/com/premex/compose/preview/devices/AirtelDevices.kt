package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * airtel device specifications for Android Compose previews.
 *
 * This extension provides airtel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Airtel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Airtel: Any
  get() = object {
      /** airtel ganesa */
      val GANESA = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
