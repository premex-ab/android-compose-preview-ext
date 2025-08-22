package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BraveTechs device specifications for Android Compose previews.
 *
 * This extension provides BraveTechs device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BraveTechs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BraveTechs: Any
  get() = object {
      /** DeviceSpec(manufacturer=BraveTechs, code=T3_Pro, width=800, height=1280, dpi=180,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BraveTechs, code=T3_Pro, width=800,
      height=1280, dpi=180, isGoogleDevice=false).code */
      val T3_PRO = "spec:width=800,height=1280,unit=px,dpi=180"

  }
