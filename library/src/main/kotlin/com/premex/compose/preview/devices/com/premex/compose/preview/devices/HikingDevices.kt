package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hiking device specifications for Android Compose previews.
 *
 * This extension provides Hiking device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hiking.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hiking: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hiking, code=A43, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hiking, code=A43, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val A43 = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
