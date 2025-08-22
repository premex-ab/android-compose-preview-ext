package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TVPLUS device specifications for Android Compose previews.
 *
 * This extension provides TVPLUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TVPLUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TVPLUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=TVPLUS, code=DV6069Y_TVPLUS, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TVPLUS, code=DV6069Y_TVPLUS,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV6069Y_TVPLUS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
