package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * UNIQ device specifications for Android Compose previews.
 *
 * This extension provides UNIQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.UNIQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.UNIQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=UNIQ, code=D10, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIQ, code=D10, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val D10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=UNIQ, code=D7, width=600, height=1024, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=UNIQ, code=D7, width=600,
      height=1024, dpi=180, isGoogleDevice=false).code */
      val D7 = "spec:width=600,height=1024,unit=px,dpi=180"

  }
