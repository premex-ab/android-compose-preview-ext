package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vocal device specifications for Android Compose previews.
 *
 * This extension provides Vocal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vocal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vocal: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vocal, code=v0, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vocal, code=v0, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val V0 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vocal, code=V01, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vocal, code=V01, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val V01 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vocal, code=V0Core, width=480, height=854, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vocal, code=V0Core, width=480,
      height=854, dpi=200, isGoogleDevice=false).code */
      val V0CORE = "spec:width=480,height=854,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Vocal, code=v1, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vocal, code=v1, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val V1 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Vocal, code=V11, width=720, height=1612, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vocal, code=V11, width=720,
      height=1612, dpi=280, isGoogleDevice=false).code */
      val V11 = "spec:width=720,height=1612,unit=px,dpi=280"

  }
