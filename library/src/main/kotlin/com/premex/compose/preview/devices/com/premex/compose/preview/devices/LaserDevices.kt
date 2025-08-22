package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Laser device specifications for Android Compose previews.
 *
 * This extension provides Laser device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Laser.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Laser: Any
  get() = object {
      /** DeviceSpec(manufacturer=Laser, code=MID-1085A100, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Laser, code=MID-1085A100,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_1085A100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Laser, code=MID_1087V9, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Laser, code=MID_1087V9, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_1087V9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Laser, code=MID_1089IPS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Laser, code=MID_1089IPS, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID_1089IPS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Laser, code=MID_1089IPSA100, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Laser, code=MID_1089IPSA100,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MID_1089IPSA100 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Laser, code=MID_1090IPSV9, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Laser, code=MID_1090IPSV9,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID_1090IPSV9 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Laser, code=MID-785A100, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Laser, code=MID-785A100, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_785A100 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Laser, code=MID_789A100, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Laser, code=MID_789A100, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_789A100 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
