package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XPLORE device specifications for Android Compose previews.
 *
 * This extension provides XPLORE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XPLORE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XPLORE: Any
  get() = object {
      /** DeviceSpec(manufacturer=XPLORE, code=M6, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XPLORE, code=M6, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val M6 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
