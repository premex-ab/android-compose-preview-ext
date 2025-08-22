package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QIN device specifications for Android Compose previews.
 *
 * This extension provides QIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QIN.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QIN: Any
  get() = object {
      /** DeviceSpec(manufacturer=QIN, code=F22Pro, width=640, height=960, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QIN, code=F22Pro, width=640,
      height=960, dpi=320, isGoogleDevice=false).code */
      val F22PRO = "spec:width=640,height=960,unit=px,dpi=320"

  }
