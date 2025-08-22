package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARK device specifications for Android Compose previews.
 *
 * This extension provides ARK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARK: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARK, code=Benefit_M9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARK, code=Benefit_M9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BENEFIT_M9 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
