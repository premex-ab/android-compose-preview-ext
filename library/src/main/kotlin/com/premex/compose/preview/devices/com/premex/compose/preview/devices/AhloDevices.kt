package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ahlo device specifications for Android Compose previews.
 *
 * This extension provides ahlo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ahlo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ahlo: Any
  get() = object {
      /** DeviceSpec(manufacturer=ahlo, code=CAV, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ahlo, code=CAV, width=1080,
      height=2408, dpi=480, isGoogleDevice=false).code */
      val CAV = "spec:width=1080,height=2408,unit=px,dpi=480"

  }
