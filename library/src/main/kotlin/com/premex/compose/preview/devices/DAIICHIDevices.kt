package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAIICHI device specifications for Android Compose previews.
 *
 * This extension provides DAIICHI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DAIICHI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DAIICHI: Any
  get() = object {
      /** DAIICHI martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

  }
