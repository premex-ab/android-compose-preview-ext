package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IXTECH device specifications for Android Compose previews.
 *
 * This extension provides IXTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.IXTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.IXTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=IXTECH, code=IX1011, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IXTECH, code=IX1011, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val IX1011 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=IXTECH, code=IX1012, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=IXTECH, code=IX1012, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val IX1012 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
