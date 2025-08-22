package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PAWBO device specifications for Android Compose previews.
 *
 * This extension provides PAWBO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PAWBO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PAWBO: Any
  get() = object {
      /** DeviceSpec(manufacturer=PAWBO, code=Tab-T13, width=1080, height=1920, dpi=210,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PAWBO, code=Tab-T13, width=1080,
      height=1920, dpi=210, isGoogleDevice=false).code */
      val TAB_T13 = "spec:width=1080,height=1920,unit=px,dpi=210"

      /** DeviceSpec(manufacturer=PAWBO, code=Tab-T8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PAWBO, code=Tab-T8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB_T8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
