package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Clover device specifications for Android Compose previews.
 *
 * This extension provides Clover device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Clover.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Clover: Any
  get() = object {
      /** DeviceSpec(manufacturer=Clover, code=G11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Clover, code=G11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val G11 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
