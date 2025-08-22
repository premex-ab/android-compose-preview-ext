package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Orbic device specifications for Android Compose previews.
 *
 * This extension provides Orbic device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Orbic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Orbic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Orbic, code=JOY2, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=JOY2, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val JOY2 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orbic, code=R678EL, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=R678EL, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val R678EL = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orbic, code=R678L5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=R678L5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val R678L5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orbic, code=R8L5T, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=R8L5T, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val R8L5T = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orbic, code=RC545L, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=RC545L, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val RC545L = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orbic, code=RC555L, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=RC555L, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val RC555L = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Orbic, code=RC608L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=RC608L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RC608L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orbic, code=RC609L, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=RC609L, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RC609L = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orbic, code=RC609LP, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=RC609LP, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RC609LP = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orbic, code=RC609LSM, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=RC609LSM, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RC609LSM = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Orbic, code=RC8L1T-RW, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=RC8L1T-RW, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val RC8L1T_RW = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Orbic, code=VC_Device, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Orbic, code=VC_Device, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val VC_DEVICE = "spec:width=800,height=1280,unit=px,dpi=240"

  }
