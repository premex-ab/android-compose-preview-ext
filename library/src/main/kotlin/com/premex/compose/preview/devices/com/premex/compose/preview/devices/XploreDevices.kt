package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Xplore device specifications for Android Compose previews.
 *
 * This extension provides Xplore device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xplore.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xplore: Any
  get() = object {
      /** DeviceSpec(manufacturer=Xplore, code=XP8105, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xplore, code=XP8105, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val XP8105 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Xplore, code=XP8105A, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Xplore, code=XP8105A, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val XP8105A = "spec:width=800,height=1280,unit=px,dpi=160"

  }
