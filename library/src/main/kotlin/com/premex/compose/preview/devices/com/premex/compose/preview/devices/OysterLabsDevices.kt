package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Oyster_Labs device specifications for Android Compose previews.
 *
 * This extension provides Oyster_Labs device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.OysterLabs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.OysterLabs: Any
  get() = object {
      /** DeviceSpec(manufacturer=Oyster_Labs, code=Universal_Phone_1, width=720, height=1600,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Oyster_Labs,
      code=Universal_Phone_1, width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val UNIVERSAL_PHONE_1 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
