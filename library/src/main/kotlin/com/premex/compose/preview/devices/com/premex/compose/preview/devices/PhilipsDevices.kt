package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * philips device specifications for Android Compose previews.
 *
 * This extension provides philips device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Philips.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Philips: Any
  get() = object {
      /** DeviceSpec(manufacturer=philips, code=E1027, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=philips, code=E1027, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E1027 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
