package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LASER device specifications for Android Compose previews.
 *
 * This extension provides LASER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LASER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LASER: Any
  get() = object {
      /** DeviceSpec(manufacturer=LASER, code=MID-104GB-968, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID-104GB-968,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MID_104GB_968 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LASER, code=MID-1087, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID-1087, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_1087 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LASER, code=MID-1090IPS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID-1090IPS, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID_1090IPS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LASER, code=MID_1099IPS, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID_1099IPS, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID_1099IPS = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LASER, code=MID_1099IPS_V13, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID_1099IPS_V13,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MID_1099IPS_V13 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=LASER, code=MID_787V9, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID_787V9, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_787V9 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LASER, code=MID_799IPS, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID_799IPS, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_799IPS = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LASER, code=MID_799IPS_V13, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID_799IPS_V13,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val MID_799IPS_V13 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=LASER, code=MID_899IPS, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LASER, code=MID_899IPS, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val MID_899IPS = "spec:width=800,height=1280,unit=px,dpi=180"

  }
