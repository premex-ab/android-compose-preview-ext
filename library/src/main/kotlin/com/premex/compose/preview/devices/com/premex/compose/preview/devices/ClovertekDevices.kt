package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * clovertek device specifications for Android Compose previews.
 *
 * This extension provides clovertek device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clovertek.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clovertek: Any
  get() = object {
      /** DeviceSpec(manufacturer=clovertek, code=FTab, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=clovertek, code=FTab, width=1200,
      height=2000, dpi=240, isGoogleDevice=false).code */
      val FTAB = "spec:width=1200,height=2000,unit=px,dpi=240"

  }
