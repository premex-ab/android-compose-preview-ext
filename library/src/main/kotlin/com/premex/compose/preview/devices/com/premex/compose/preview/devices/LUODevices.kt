package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LUO device specifications for Android Compose previews.
 *
 * This extension provides LUO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LUO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LUO: Any
  get() = object {
      /** DeviceSpec(manufacturer=LUO, code=P70_Pro, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUO, code=P70_Pro, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val P70_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LUO, code=S15_Pro, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUO, code=S15_Pro, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val S15_PRO = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LUO, code=S16_Pro, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUO, code=S16_Pro, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val S16_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LUO, code=S17_Pro, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUO, code=S17_Pro, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val S17_PRO = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LUO, code=S18_Max, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LUO, code=S18_Max, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val S18_MAX = "spec:width=720,height=1640,unit=px,dpi=320"

  }
