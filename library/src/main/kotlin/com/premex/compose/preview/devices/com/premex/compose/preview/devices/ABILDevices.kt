package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ABIL device specifications for Android Compose previews.
 *
 * This extension provides ABIL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ABIL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ABIL: Any
  get() = object {
      /** DeviceSpec(manufacturer=ABIL, code=A8, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ABIL, code=A8, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val A8 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
