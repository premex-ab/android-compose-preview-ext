package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wileyfox device specifications for Android Compose previews.
 *
 * This extension provides Wileyfox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wileyfox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wileyfox: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wileyfox, code=crackling, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wileyfox, code=crackling,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val CRACKLING = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Wileyfox, code=marmite, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wileyfox, code=marmite, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val MARMITE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Wileyfox, code=porridge, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wileyfox, code=porridge, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val PORRIDGE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Wileyfox, code=porridgek3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wileyfox, code=porridgek3,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val PORRIDGEK3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
