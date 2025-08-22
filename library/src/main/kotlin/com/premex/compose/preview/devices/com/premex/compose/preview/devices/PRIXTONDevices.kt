package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PRIXTON device specifications for Android Compose previews.
 *
 * This extension provides PRIXTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PRIXTON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PRIXTON: Any
  get() = object {
      /** DeviceSpec(manufacturer=PRIXTON, code=Nova, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PRIXTON, code=Nova, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NOVA = "spec:width=800,height=1280,unit=px,dpi=213"

  }
