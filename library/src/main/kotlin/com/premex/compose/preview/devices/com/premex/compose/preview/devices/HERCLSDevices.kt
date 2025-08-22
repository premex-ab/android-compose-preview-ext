package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HERCLS device specifications for Android Compose previews.
 *
 * This extension provides HERCLS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HERCLS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HERCLS: Any
  get() = object {
      /** DeviceSpec(manufacturer=HERCLS, code=L925, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HERCLS, code=L925, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val L925 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
