package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * V2com device specifications for Android Compose previews.
 *
 * This extension provides V2com device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.V2com.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.V2com: Any
  get() = object {
      /** DeviceSpec(manufacturer=V2com, code=ROCKY_T2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=V2com, code=ROCKY_T2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ROCKY_T2 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
