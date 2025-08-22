package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZOOM device specifications for Android Compose previews.
 *
 * This extension provides ZOOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZOOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZOOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZOOM, code=ULTRA, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZOOM, code=ULTRA, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val ULTRA = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ZOOM, code=ULTRA_Plus, width=600, height=1024, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZOOM, code=ULTRA_Plus, width=600,
      height=1024, dpi=220, isGoogleDevice=false).code */
      val ULTRA_PLUS = "spec:width=600,height=1024,unit=px,dpi=220"

  }
