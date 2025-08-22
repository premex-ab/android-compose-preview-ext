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
      /** DeviceSpec(manufacturer=DENS-TV, code=B866V2FAV5_DensTV, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENS-TV, code=B866V2FAV5_DensTV,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val B866V2FAV5_DENSTV = "spec:width=720,height=1280,unit=px,dpi=320"

  }
