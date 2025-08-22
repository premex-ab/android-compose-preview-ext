package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SELECTRON device specifications for Android Compose previews.
 *
 * This extension provides SELECTRON device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SELECTRON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SELECTRON: Any
  get() = object {
      /** DeviceSpec(manufacturer=SELECTRON, code=T856G, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SELECTRON, code=T856G, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val T856G = "spec:width=800,height=1280,unit=px,dpi=240"

  }
