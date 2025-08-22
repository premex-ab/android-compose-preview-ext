package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LW device specifications for Android Compose previews.
 *
 * This extension provides LW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LW: Any
  get() = object {
      /** DeviceSpec(manufacturer=LW, code=LW788, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LW, code=LW788, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val LW788 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
