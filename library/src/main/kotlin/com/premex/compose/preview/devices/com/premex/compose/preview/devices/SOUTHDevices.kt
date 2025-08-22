package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SOUTH device specifications for Android Compose previews.
 *
 * This extension provides SOUTH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SOUTH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SOUTH: Any
  get() = object {
      /** DeviceSpec(manufacturer=SOUTH, code=H6LM, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SOUTH, code=H6LM, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val H6LM = "spec:width=720,height=1280,unit=px,dpi=320"

  }
