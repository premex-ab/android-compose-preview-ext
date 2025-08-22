package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DCG device specifications for Android Compose previews.
 *
 * This extension provides DCG device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DCG.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DCG: Any
  get() = object {
      /** DeviceSpec(manufacturer=DCG, code=DCG-N10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DCG, code=DCG-N10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DCG_N10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
