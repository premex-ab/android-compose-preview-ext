package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Lumigon device specifications for Android Compose previews.
 *
 * This extension provides Lumigon device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lumigon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lumigon: Any
  get() = object {
      /** DeviceSpec(manufacturer=Lumigon, code=Lumigon_T3, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Lumigon, code=Lumigon_T3,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val LUMIGON_T3 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
