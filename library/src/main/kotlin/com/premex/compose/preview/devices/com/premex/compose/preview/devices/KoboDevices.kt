package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * kobo device specifications for Android Compose previews.
 *
 * This extension provides kobo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kobo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kobo: Any
  get() = object {
      /** DeviceSpec(manufacturer=kobo, code=zeus, width=800, height=1205, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=kobo, code=zeus, width=800,
      height=1205, dpi=213, isGoogleDevice=false).code */
      val ZEUS = "spec:width=800,height=1205,unit=px,dpi=213"

  }
