package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * POSSAFE device specifications for Android Compose previews.
 *
 * This extension provides POSSAFE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.POSSAFE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.POSSAFE: Any
  get() = object {
      /** DeviceSpec(manufacturer=POSSAFE, code=OrderGo5, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POSSAFE, code=OrderGo5, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ORDERGO5 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=POSSAFE, code=OrderGo_6, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=POSSAFE, code=OrderGo_6, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ORDERGO_6 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
