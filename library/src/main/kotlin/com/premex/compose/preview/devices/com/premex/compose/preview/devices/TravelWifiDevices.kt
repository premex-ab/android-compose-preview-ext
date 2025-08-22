package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TravelWifi device specifications for Android Compose previews.
 *
 * This extension provides TravelWifi device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TravelWifi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TravelWifi: Any
  get() = object {
      /** DeviceSpec(manufacturer=TravelWifi, code=Sapphire_Tablet, width=1200, height=1920,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TravelWifi,
      code=Sapphire_Tablet, width=1200, height=1920, dpi=320, isGoogleDevice=false).code */
      val SAPPHIRE_TABLET = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
