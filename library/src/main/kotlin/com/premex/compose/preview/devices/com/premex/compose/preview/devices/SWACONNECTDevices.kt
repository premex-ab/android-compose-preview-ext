package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SWACONNECT device specifications for Android Compose previews.
 *
 * This extension provides SWACONNECT device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SWACONNECT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SWACONNECT: Any
  get() = object {
      /** DeviceSpec(manufacturer=SWACONNECT, code=SWA310, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SWACONNECT, code=SWA310, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val SWA310 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
