package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Altron device specifications for Android Compose previews.
 *
 * This extension provides Altron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Altron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Altron: Any
  get() = object {
      /** DeviceSpec(manufacturer=Altron, code=OB-1021, width=800, height=1280, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altron, code=OB-1021, width=800,
      height=1280, dpi=210, isGoogleDevice=false).code */
      val OB_1021 = "spec:width=800,height=1280,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=Altron, code=OB_588, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altron, code=OB_588, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val OB_588 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Altron, code=OB_628, width=480, height=960, dpi=204,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altron, code=OB_628, width=480,
      height=960, dpi=204, isGoogleDevice=false).code */
      val OB_628 = "spec:width=480,height=960,unit=px,dpi=204"

      /** DeviceSpec(manufacturer=Altron, code=OB-728, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Altron, code=OB-728, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val OB_728 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
