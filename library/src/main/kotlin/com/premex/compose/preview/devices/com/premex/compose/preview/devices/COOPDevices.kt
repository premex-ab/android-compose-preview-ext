package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COOP device specifications for Android Compose previews.
 *
 * This extension provides COOP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COOP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COOP: Any
  get() = object {
      /** DeviceSpec(manufacturer=COOP, code=MARTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COOP, code=MARTE, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MARTE = "spec:width=800,height=1280,unit=px,dpi=213"

  }
