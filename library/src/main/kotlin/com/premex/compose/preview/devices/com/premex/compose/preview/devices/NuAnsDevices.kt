package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NuAns device specifications for Android Compose previews.
 *
 * This extension provides NuAns device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NuAns.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NuAns: Any
  get() = object {
      /** DeviceSpec(manufacturer=NuAns, code=NEO2, width=1080, height=1920, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NuAns, code=NEO2, width=1080,
      height=1920, dpi=420, isGoogleDevice=false).code */
      val NEO2 = "spec:width=1080,height=1920,unit=px,dpi=420"

  }
