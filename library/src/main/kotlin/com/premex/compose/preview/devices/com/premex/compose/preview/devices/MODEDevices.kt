package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MODE device specifications for Android Compose previews.
 *
 * This extension provides MODE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MODE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MODE: Any
  get() = object {
      /** DeviceSpec(manufacturer=MODE, code=MP1, width=720, height=1600, dpi=300,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MODE, code=MP1, width=720,
      height=1600, dpi=300, isGoogleDevice=false).code */
      val MP1 = "spec:width=720,height=1600,unit=px,dpi=300"

  }
