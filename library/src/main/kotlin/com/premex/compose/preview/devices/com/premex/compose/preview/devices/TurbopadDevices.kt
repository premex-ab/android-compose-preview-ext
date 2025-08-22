package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Turbopad device specifications for Android Compose previews.
 *
 * This extension provides Turbopad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Turbopad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Turbopad: Any
  get() = object {
      /** DeviceSpec(manufacturer=Turbopad, code=Dream, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turbopad, code=Dream, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DREAM = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Turbopad, code=Turbopad1015NEW, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turbopad, code=Turbopad1015NEW,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TURBOPAD1015NEW = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Turbopad, code=Turbopad1016NEW, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turbopad, code=Turbopad1016NEW,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TURBOPAD1016NEW = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Turbopad, code=TurboPadPro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Turbopad, code=TurboPadPro,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val TURBOPADPRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
