package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Trecfone device specifications for Android Compose previews.
 *
 * This extension provides Trecfone device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Trecfone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Trecfone: Any
  get() = object {
      /** DeviceSpec(manufacturer=Trecfone, code=T20, width=1080, height=2460, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trecfone, code=T20, width=1080,
      height=2460, dpi=480, isGoogleDevice=false).code */
      val T20 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Trecfone, code=16_Pro_Max, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trecfone, code=16_Pro_Max,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val _16_PRO_MAX = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Trecfone, code=17_Pro_Max, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Trecfone, code=17_Pro_Max,
      width=720, height=1612, dpi=320, isGoogleDevice=false).code */
      val _17_PRO_MAX = "spec:width=720,height=1612,unit=px,dpi=320"

  }
