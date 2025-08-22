package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * XB device specifications for Android Compose previews.
 *
 * This extension provides XB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.XB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.XB: Any
  get() = object {
      /** DeviceSpec(manufacturer=XB, code=XB-T11i, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=XB, code=XB-T11i, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val XB_T11I = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
