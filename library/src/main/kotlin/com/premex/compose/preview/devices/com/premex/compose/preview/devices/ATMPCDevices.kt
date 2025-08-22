package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ATMPC device specifications for Android Compose previews.
 *
 * This extension provides ATMPC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ATMPC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ATMPC: Any
  get() = object {
      /** DeviceSpec(manufacturer=ATMPC, code=IT-1001A, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATMPC, code=IT-1001A, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val IT_1001A = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ATMPC, code=IT_701A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATMPC, code=IT_701A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val IT_701A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATMPC, code=IT-701A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATMPC, code=IT-701A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val IT_701A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATMPC, code=IT_701A1, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATMPC, code=IT_701A1, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val IT_701A1 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATMPC, code=IT-801B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATMPC, code=IT-801B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IT_801B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATMPC, code=IT_801B, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATMPC, code=IT_801B, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IT_801B = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ATMPC, code=IT-801BA3, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ATMPC, code=IT-801BA3, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IT_801BA3 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
