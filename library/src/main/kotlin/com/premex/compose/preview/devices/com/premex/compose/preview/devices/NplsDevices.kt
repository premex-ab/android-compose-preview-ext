package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * npls device specifications for Android Compose previews.
 *
 * This extension provides npls device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Npls.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Npls: Any
  get() = object {
      /** DeviceSpec(manufacturer=npls, code=uzx4020nps, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=npls, code=uzx4020nps, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val UZX4020NPS = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
