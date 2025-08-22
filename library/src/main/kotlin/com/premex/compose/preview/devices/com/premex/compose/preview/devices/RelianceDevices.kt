package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Reliance device specifications for Android Compose previews.
 *
 * This extension provides Reliance device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Reliance.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Reliance: Any
  get() = object {
      /** DeviceSpec(manufacturer=Reliance, code=RC500L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reliance, code=RC500L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RC500L = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Reliance, code=RC501L, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Reliance, code=RC501L, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val RC501L = "spec:width=720,height=1280,unit=px,dpi=320"

  }
