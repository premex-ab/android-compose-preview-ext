package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VOLENTEX device specifications for Android Compose previews.
 *
 * This extension provides VOLENTEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VOLENTEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VOLENTEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=VOLENTEX, code=M10_A04, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VOLENTEX, code=M10_A04, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val M10_A04 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
