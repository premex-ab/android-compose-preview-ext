package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Intelligen device specifications for Android Compose previews.
 *
 * This extension provides Intelligen device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Intelligen.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Intelligen: Any
  get() = object {
      /** DeviceSpec(manufacturer=Intelligen, code=IN-101, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Intelligen, code=IN-101,
      width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val IN_101 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
