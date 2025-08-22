package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Vizualogic device specifications for Android Compose previews.
 *
 * This extension provides Vizualogic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Vizualogic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Vizualogic: Any
  get() = object {
      /** DeviceSpec(manufacturer=Vizualogic, code=Q83, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Vizualogic, code=Q83, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val Q83 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
