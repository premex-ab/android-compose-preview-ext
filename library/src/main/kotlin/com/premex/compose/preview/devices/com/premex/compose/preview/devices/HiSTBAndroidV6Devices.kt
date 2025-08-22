package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HiSTBAndroidV6 device specifications for Android Compose previews.
 *
 * This extension provides HiSTBAndroidV6 device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HiSTBAndroidV6.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HiSTBAndroidV6: Any
  get() = object {
      /** DeviceSpec(manufacturer=HiSTBAndroidV6, code=Hi3798MV200, width=1080, height=1920,
      dpi=240, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HiSTBAndroidV6,
      code=Hi3798MV200, width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val HI3798MV200 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
