package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KOOLMAAX device specifications for Android Compose previews.
 *
 * This extension provides KOOLMAAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KOOLMAAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KOOLMAAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=KOOLMAAX, code=GEMINI, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KOOLMAAX, code=GEMINI, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val GEMINI = "spec:width=480,height=960,unit=px,dpi=220"

  }
