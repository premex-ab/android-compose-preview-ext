package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maxvi device specifications for Android Compose previews.
 *
 * This extension provides Maxvi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxvi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxvi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Maxvi, code=MS502_Orion, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxvi, code=MS502_Orion, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MS502_ORION = "spec:width=480,height=960,unit=px,dpi=240"

  }
