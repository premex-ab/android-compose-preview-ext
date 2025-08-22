package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MwalimuPlus device specifications for Android Compose previews.
 *
 * This extension provides MwalimuPlus device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MwalimuPlus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MwalimuPlus: Any
  get() = object {
      /** DeviceSpec(manufacturer=MwalimuPlus, code=MP01A3G, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MwalimuPlus, code=MP01A3G,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val MP01A3G = "spec:width=800,height=1280,unit=px,dpi=213"

  }
