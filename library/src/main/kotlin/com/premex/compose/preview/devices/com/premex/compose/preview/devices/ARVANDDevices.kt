package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARVAND device specifications for Android Compose previews.
 *
 * This extension provides ARVAND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARVAND.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARVAND: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARVAND, code=M863TabH8, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARVAND, code=M863TabH8, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val M863TABH8 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
