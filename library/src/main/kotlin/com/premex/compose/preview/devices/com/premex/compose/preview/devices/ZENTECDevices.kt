package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZENTEC device specifications for Android Compose previews.
 *
 * This extension provides ZENTEC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZENTEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZENTEC: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZENTEC, code=ALTAB08, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZENTEC, code=ALTAB08, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ALTAB08 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
