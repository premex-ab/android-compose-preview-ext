package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIDIK device specifications for Android Compose previews.
 *
 * This extension provides DIDIK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DIDIK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DIDIK: Any
  get() = object {
      /** DeviceSpec(manufacturer=DIDIK, code=DT24Plus, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DIDIK, code=DT24Plus, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val DT24PLUS = "spec:width=800,height=1280,unit=px,dpi=160"

  }
