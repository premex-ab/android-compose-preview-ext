package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * bell device specifications for Android Compose previews.
 *
 * This extension provides bell device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bell: Any
  get() = object {
      /** DeviceSpec(manufacturer=bell, code=sti6130d324, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=bell, code=sti6130d324, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6130D324 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
