package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEXT_TECHNOLOGIES device specifications for Android Compose previews.
 *
 * This extension provides NEXT_TECHNOLOGIES device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEXTTECHNOLOGIES.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEXTTECHNOLOGIES: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEXT_TECHNOLOGIES, code=N7526, width=480, height=800, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEXT_TECHNOLOGIES, code=N7526,
      width=480, height=800, dpi=120, isGoogleDevice=false).code */
      val N7526 = "spec:width=480,height=800,unit=px,dpi=120"

  }
