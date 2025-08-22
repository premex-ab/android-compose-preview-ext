package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DENS-TV device specifications for Android Compose previews.
 *
 * This extension provides DENS-TV device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DENSTV.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DENSTV: Any
  get() = object {
      /** DENS-TV B866V2FAV5_DensTV */
      val B866V2FAV5_DENSTV = "spec:width=720,height=1280,unit=px,dpi=320"

  }
