package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UBOS device specifications for Android Compose previews.
 *
 * This extension provides UBOS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UBOS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UBOS: Any
  get() = object {
      /** UBOS UTAB */
      val UTAB = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
