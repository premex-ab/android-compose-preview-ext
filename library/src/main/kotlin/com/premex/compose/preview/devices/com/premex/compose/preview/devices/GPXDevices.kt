package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GPX device specifications for Android Compose previews.
 *
 * This extension provides GPX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GPX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GPX: Any
  get() = object {
      /** DeviceSpec(manufacturer=GPX, code=TBDV1093, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GPX, code=TBDV1093, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TBDV1093 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
