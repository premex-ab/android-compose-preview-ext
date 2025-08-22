package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SERENITY device specifications for Android Compose previews.
 *
 * This extension provides SERENITY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SERENITY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SERENITY: Any
  get() = object {
      /** DeviceSpec(manufacturer=SERENITY, code=BE109, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SERENITY, code=BE109, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val BE109 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
