package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Own device specifications for Android Compose previews.
 *
 * This extension provides Own device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Own.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Own: Any
  get() = object {
      /** DeviceSpec(manufacturer=Own, code=Smart8, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Own, code=Smart8, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART8 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Own, code=SMART_PLUS_LTE, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Own, code=SMART_PLUS_LTE,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART_PLUS_LTE = "spec:width=720,height=1280,unit=px,dpi=320"

  }
