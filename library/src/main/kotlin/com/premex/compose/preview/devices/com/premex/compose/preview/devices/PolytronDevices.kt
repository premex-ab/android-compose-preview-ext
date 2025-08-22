package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Polytron device specifications for Android Compose previews.
 *
 * This extension provides Polytron device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Polytron.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Polytron: Any
  get() = object {
      /** DeviceSpec(manufacturer=Polytron, code=hayward, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polytron, code=hayward, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val HAYWARD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polytron, code=osaki, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polytron, code=osaki, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Polytron, code=P500, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polytron, code=P500, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P500 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Polytron, code=P551S, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polytron, code=P551S, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val P551S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Polytron, code=songshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Polytron, code=songshan,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
