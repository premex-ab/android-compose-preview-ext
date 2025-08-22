package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NAXA device specifications for Android Compose previews.
 *
 * This extension provides NAXA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NAXA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NAXA: Any
  get() = object {
      /** DeviceSpec(manufacturer=NAXA, code=NID-1050, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAXA, code=NID-1050, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NID_1050 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAXA, code=NID_1055, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAXA, code=NID_1055, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NID_1055 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAXA, code=NID_1056, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAXA, code=NID_1056, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val NID_1056 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAXA, code=NID_7021, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAXA, code=NID_7021, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NID_7021 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAXA, code=NID_7022, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAXA, code=NID_7022, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NID_7022 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAXA, code=NID_7055, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAXA, code=NID_7055, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NID_7055 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=NAXA, code=NID_7056, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NAXA, code=NID_7056, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val NID_7056 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
