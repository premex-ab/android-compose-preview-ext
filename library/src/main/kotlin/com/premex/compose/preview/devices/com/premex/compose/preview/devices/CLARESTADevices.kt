package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CLARESTA device specifications for Android Compose previews.
 *
 * This extension provides CLARESTA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CLARESTA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CLARESTA: Any
  get() = object {
      /** DeviceSpec(manufacturer=CLARESTA, code=S6Plus, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CLARESTA, code=S6Plus, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val S6PLUS = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
