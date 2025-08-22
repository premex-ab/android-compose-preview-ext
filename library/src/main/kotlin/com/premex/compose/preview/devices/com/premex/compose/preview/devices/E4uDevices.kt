package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * e4u device specifications for Android Compose previews.
 *
 * This extension provides e4u device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.E4u.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.E4u: Any
  get() = object {
      /** DeviceSpec(manufacturer=e4u, code=TAB900, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=e4u, code=TAB900, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TAB900 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
