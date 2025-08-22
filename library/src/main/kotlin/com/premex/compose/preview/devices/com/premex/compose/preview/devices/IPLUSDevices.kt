package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * i-PLUS device specifications for Android Compose previews.
 *
 * This extension provides i-PLUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IPLUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IPLUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=i-PLUS, code=Nu60, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-PLUS, code=Nu60, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val NU60 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=i-PLUS, code=Nu65, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-PLUS, code=Nu65, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NU65 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=i-PLUS, code=NU70, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-PLUS, code=NU70, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NU70 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=i-PLUS, code=Omega7, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-PLUS, code=Omega7, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val OMEGA7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=i-PLUS, code=Omega8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=i-PLUS, code=Omega8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OMEGA8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
