package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UJJ device specifications for Android Compose previews.
 *
 * This extension provides UJJ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UJJ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UJJ: Any
  get() = object {
      /** DeviceSpec(manufacturer=UJJ, code=U3_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UJJ, code=U3_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U3_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UJJ, code=U3_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UJJ, code=U3_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U3_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UJJ, code=U6_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UJJ, code=U6_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U6_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UJJ, code=U6_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UJJ, code=U6_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U6_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UJJ, code=U7_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UJJ, code=U7_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U7_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UJJ, code=U7_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UJJ, code=U7_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U7_US = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UJJ, code=U8_EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UJJ, code=U8_EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U8_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=UJJ, code=U8_US, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UJJ, code=U8_US, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val U8_US = "spec:width=800,height=1280,unit=px,dpi=160"

  }
