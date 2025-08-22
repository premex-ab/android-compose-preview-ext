package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DENVER device specifications for Android Compose previews.
 *
 * This extension provides DENVER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DENVER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DENVER: Any
  get() = object {
      /** DeviceSpec(manufacturer=DENVER, code=SCQ-50001G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=SCQ-50001G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SCQ_50001G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DENVER, code=SDQ-55044L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=SDQ-55044L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SDQ_55044L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DENVER, code=SDQ-57004L, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=SDQ-57004L, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val SDQ_57004L = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DENVER, code=TAQ10, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=TAQ10, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAQ10 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DENVER, code=TAQ102, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=TAQ102, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAQ102 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DENVER, code=TAQ70, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=TAQ70, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAQ70 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DENVER, code=TAQ-104A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=TAQ-104A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAQ_104A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DENVER, code=TAQ_10G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=TAQ_10G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAQ_10G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DENVER, code=TAQ-703A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=TAQ-703A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TAQ_703A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DENVER, code=TIQ102, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=TIQ102, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TIQ102 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DENVER, code=TIQ_1048, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DENVER, code=TIQ_1048, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TIQ_1048 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
