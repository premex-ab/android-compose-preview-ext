package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BMXC device specifications for Android Compose previews.
 *
 * This extension provides BMXC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BMXC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BMXC: Any
  get() = object {
      /** DeviceSpec(manufacturer=BMXC, code=BM108, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMXC, code=BM108, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BM108 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMXC, code=JR-M802, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMXC, code=JR-M802, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val JR_M802 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMXC, code=K107, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMXC, code=K107, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K107 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMXC, code=K107-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMXC, code=K107-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K107_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMXC, code=M107, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMXC, code=M107, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val M107 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=BMXC, code=M863, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMXC, code=M863, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M863 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=BMXC, code=M863-EEA, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BMXC, code=M863-EEA, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M863_EEA = "spec:width=800,height=1280,unit=px,dpi=160"

  }
