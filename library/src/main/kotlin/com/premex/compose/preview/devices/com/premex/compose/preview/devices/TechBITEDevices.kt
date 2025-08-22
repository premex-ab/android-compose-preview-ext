package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * techBITE device specifications for Android Compose previews.
 *
 * This extension provides techBITE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TechBITE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TechBITE: Any
  get() = object {
      /** DeviceSpec(manufacturer=techBITE, code=DV8219, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=techBITE, code=DV8219, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8219 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
