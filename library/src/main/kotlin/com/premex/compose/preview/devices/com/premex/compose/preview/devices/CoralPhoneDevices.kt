package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CoralPhone device specifications for Android Compose previews.
 *
 * This extension provides CoralPhone device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CoralPhone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CoralPhone: Any
  get() = object {
      /** DeviceSpec(manufacturer=CoralPhone, code=CoralNeural3, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CoralPhone, code=CoralNeural3,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val CORALNEURAL3 = "spec:width=1080,height=2400,unit=px,dpi=480"

  }
