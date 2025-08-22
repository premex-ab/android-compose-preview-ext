package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CarbonMobile device specifications for Android Compose previews.
 *
 * This extension provides CarbonMobile device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CarbonMobile.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CarbonMobile: Any
  get() = object {
      /** DeviceSpec(manufacturer=CarbonMobile, code=C1M2BD_R2, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CarbonMobile, code=C1M2BD_R2,
      width=1080, height=2160, dpi=480, isGoogleDevice=false).code */
      val C1M2BD_R2 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
