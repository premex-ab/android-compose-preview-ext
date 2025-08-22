package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ABCTECH device specifications for Android Compose previews.
 *
 * This extension provides ABCTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ABCTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ABCTECH: Any
  get() = object {
      /** DeviceSpec(manufacturer=ABCTECH, code=PG11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ABCTECH, code=PG11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val PG11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ABCTECH, code=X20, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ABCTECH, code=X20, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val X20 = "spec:width=1200,height=1920,unit=px,dpi=320"

  }
