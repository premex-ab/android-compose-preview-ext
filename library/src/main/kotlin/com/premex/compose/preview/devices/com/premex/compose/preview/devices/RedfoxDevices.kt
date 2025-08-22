package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * redfox device specifications for Android Compose previews.
 *
 * This extension provides redfox device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Redfox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Redfox: Any
  get() = object {
      /** DeviceSpec(manufacturer=redfox, code=wvv832, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=redfox, code=wvv832, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val WVV832 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
