package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Challenger device specifications for Android Compose previews.
 *
 * This extension provides Challenger device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Challenger.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Challenger: Any
  get() = object {
      /** DeviceSpec(manufacturer=Challenger, code=gangbyeon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Challenger, code=gangbyeon,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Challenger, code=osaki, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Challenger, code=osaki, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val OSAKI = "spec:width=720,height=1280,unit=px,dpi=213"

  }
