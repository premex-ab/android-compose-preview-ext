package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PCBOX device specifications for Android Compose previews.
 *
 * This extension provides PCBOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PCBOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PCBOX: Any
  get() = object {
      /** DeviceSpec(manufacturer=PCBOX, code=Kova_PCB-T730, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCBOX, code=Kova_PCB-T730,
      width=600, height=1024, dpi=160, isGoogleDevice=false).code */
      val KOVA_PCB_T730 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PCBOX, code=mid1008, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCBOX, code=mid1008, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID1008 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PCBOX, code=mid1032_mk, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCBOX, code=mid1032_mk, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1032_MK = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PCBOX, code=MID7015A-MK, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCBOX, code=MID7015A-MK, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID7015A_MK = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PCBOX, code=PCB-T105, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCBOX, code=PCB-T105, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PCB_T105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PCBOX, code=PCB-T106, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCBOX, code=PCB-T106, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val PCB_T106 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=PCBOX, code=PCB_T801, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PCBOX, code=PCB_T801, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val PCB_T801 = "spec:width=800,height=1280,unit=px,dpi=180"

  }
