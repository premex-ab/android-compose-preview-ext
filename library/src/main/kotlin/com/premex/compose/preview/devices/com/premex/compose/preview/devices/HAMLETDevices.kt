package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAMLET device specifications for Android Compose previews.
 *
 * This extension provides HAMLET device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HAMLET.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HAMLET: Any
  get() = object {
      /** DeviceSpec(manufacturer=HAMLET, code=XZPAD414LTE, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAMLET, code=XZPAD414LTE,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val XZPAD414LTE = "spec:width=800,height=1280,unit=px,dpi=213"

  }
