package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hipstreet_Dtac device specifications for Android Compose previews.
 *
 * This extension provides Hipstreet_Dtac device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HipstreetDtac.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HipstreetDtac: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hipstreet_Dtac, code=Joey_Jet_2, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hipstreet_Dtac, code=Joey_Jet_2,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val JOEY_JET_2 = "spec:width=480,height=800,unit=px,dpi=240"

  }
