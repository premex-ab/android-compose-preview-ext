package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Jio device specifications for Android Compose previews.
 *
 * This extension provides Jio device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jio: Any
  get() = object {
      /** DeviceSpec(manufacturer=Jio, code=LS1542QW, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jio, code=LS1542QW, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LS1542QW = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Jio, code=LS1542QWN, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jio, code=LS1542QWN, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val LS1542QWN = "spec:width=720,height=1440,unit=px,dpi=320"

  }
