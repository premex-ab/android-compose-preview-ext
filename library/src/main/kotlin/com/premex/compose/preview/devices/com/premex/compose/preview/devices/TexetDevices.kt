package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Texet device specifications for Android Compose previews.
 *
 * This extension provides Texet device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Texet.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Texet: Any
  get() = object {
      /** DeviceSpec(manufacturer=Texet, code=TM-5075, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Texet, code=TM-5075, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TM_5075 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Texet, code=TM-5076, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Texet, code=TM-5076, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TM_5076 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Texet, code=TM-5077, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Texet, code=TM-5077, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val TM_5077 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Texet, code=TM-5083, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Texet, code=TM-5083, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val TM_5083 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Texet, code=TM-5084, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Texet, code=TM-5084, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val TM_5084 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Texet, code=TM-5583, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Texet, code=TM-5583, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val TM_5583 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Texet, code=TM-5703, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Texet, code=TM-5703, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val TM_5703 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
