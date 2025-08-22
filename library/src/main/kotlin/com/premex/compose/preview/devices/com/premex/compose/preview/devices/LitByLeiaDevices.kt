package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LitByLeia device specifications for Android Compose previews.
 *
 * This extension provides LitByLeia device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LitByLeia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LitByLeia: Any
  get() = object {
      /** DeviceSpec(manufacturer=LitByLeia, code=LPD-10W, width=1600, height=2560, dpi=340,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LitByLeia, code=LPD-10W,
      width=1600, height=2560, dpi=340, isGoogleDevice=false).code */
      val LPD_10W = "spec:width=1600,height=2560,unit=px,dpi=340"

  }
