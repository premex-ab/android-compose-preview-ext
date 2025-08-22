package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Technopc device specifications for Android Compose previews.
 *
 * This extension provides Technopc device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Technopc.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Technopc: Any
  get() = object {
      /** DeviceSpec(manufacturer=Technopc, code=Technopc_UP10S43LA, width=1200, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technopc,
      code=Technopc_UP10S43LA, width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val TECHNOPC_UP10S43LA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Technopc, code=Technopc_UP10SI36LA, width=1200, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technopc,
      code=Technopc_UP10SI36LA, width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val TECHNOPC_UP10SI36LA = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Technopc, code=TM-T10SA, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technopc, code=TM-T10SA,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TM_T10SA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Technopc, code=TM-T10SA-V2, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Technopc, code=TM-T10SA-V2,
      width=1200, height=1920, dpi=240, isGoogleDevice=false).code */
      val TM_T10SA_V2 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
