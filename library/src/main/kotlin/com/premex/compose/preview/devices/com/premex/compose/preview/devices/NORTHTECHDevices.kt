package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NORTH_TECH device specifications for Android Compose previews.
 *
 * This extension provides NORTH_TECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NORTHTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NORTHTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=NORTH_TECH, code=NT-S10, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NORTH_TECH, code=NT-S10, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NT_S10 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
