package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Jivi device specifications for Android Compose previews.
 *
 * This extension provides Jivi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jivi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jivi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Jivi, code=Xtreme_3, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jivi, code=Xtreme_3, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val XTREME_3 = "spec:width=480,height=960,unit=px,dpi=240"

  }
