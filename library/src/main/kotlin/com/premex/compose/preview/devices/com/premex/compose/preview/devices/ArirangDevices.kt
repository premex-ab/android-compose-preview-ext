package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Arirang device specifications for Android Compose previews.
 *
 * This extension provides Arirang device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Arirang.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Arirang: Any
  get() = object {
      /** DeviceSpec(manufacturer=Arirang, code=ATPA801_1, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Arirang, code=ATPA801_1, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ATPA801_1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
