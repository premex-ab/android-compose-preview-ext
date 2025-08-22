package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ixtech device specifications for Android Compose previews.
 *
 * This extension provides ixtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ixtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ixtech: Any
  get() = object {
      /** DeviceSpec(manufacturer=ixtech, code=IX1013, width=1200, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ixtech, code=IX1013, width=1200,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val IX1013 = "spec:width=1200,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ixtech, code=IX701, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ixtech, code=IX701, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val IX701 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
