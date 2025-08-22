package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * I-Bridge device specifications for Android Compose previews.
 *
 * This extension provides I-Bridge device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IBridge.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IBridge: Any
  get() = object {
      /** DeviceSpec(manufacturer=I-Bridge, code=IBT01H_BDS, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=I-Bridge, code=IBT01H_BDS,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val IBT01H_BDS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=I-Bridge, code=IBT02H, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=I-Bridge, code=IBT02H, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val IBT02H = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
