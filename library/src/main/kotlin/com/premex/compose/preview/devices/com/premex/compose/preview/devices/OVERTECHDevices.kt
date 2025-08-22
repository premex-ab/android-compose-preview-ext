package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * OVERTECH device specifications for Android Compose previews.
 *
 * This extension provides OVERTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OVERTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OVERTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=OVERTECH, code=OX7A, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OVERTECH, code=OX7A, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val OX7A = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=OVERTECH, code=OX7S, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=OVERTECH, code=OX7S, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val OX7S = "spec:width=600,height=1024,unit=px,dpi=160"

  }
