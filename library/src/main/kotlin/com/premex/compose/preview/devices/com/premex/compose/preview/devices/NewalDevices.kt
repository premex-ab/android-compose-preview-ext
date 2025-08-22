package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Newal device specifications for Android Compose previews.
 *
 * This extension provides Newal device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Newal.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Newal: Any
  get() = object {
      /** DeviceSpec(manufacturer=Newal, code=marina, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newal, code=marina, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Newal, code=nagata, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Newal, code=nagata, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NAGATA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
