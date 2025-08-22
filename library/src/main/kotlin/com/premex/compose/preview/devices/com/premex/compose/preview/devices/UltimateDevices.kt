package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ultimate device specifications for Android Compose previews.
 *
 * This extension provides Ultimate device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ultimate.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ultimate: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ultimate, code=Ultimate_FU, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ultimate, code=Ultimate_FU,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val ULTIMATE_FU = "spec:width=720,height=1600,unit=px,dpi=320"

  }
