package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LYNKNEX device specifications for Android Compose previews.
 *
 * This extension provides LYNKNEX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LYNKNEX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LYNKNEX: Any
  get() = object {
      /** DeviceSpec(manufacturer=LYNKNEX, code=LYNKNEX-PX5, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LYNKNEX, code=LYNKNEX-PX5,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val LYNKNEX_PX5 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
