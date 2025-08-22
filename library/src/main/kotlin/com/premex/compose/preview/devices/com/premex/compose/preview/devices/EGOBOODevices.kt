package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EGOBOO device specifications for Android Compose previews.
 *
 * This extension provides EGOBOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EGOBOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EGOBOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=EGOBOO, code=EB101, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EGOBOO, code=EB101, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val EB101 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** DeviceSpec(manufacturer=EGOBOO, code=EB104, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=EGOBOO, code=EB104, width=1200,
      height=2000, dpi=280, isGoogleDevice=false).code */
      val EB104 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
