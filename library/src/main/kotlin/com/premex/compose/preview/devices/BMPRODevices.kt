package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BMPRO device specifications for Android Compose previews.
 *
 * This extension provides BMPRO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BMPRO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BMPRO: Any
  get() = object {
      /** BMPRO BMPRO7DI */
      val BMPRO7DI = "spec:width=600,height=1024,unit=px,dpi=160"

  }
