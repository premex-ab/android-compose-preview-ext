package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SYMPHONY device specifications for Android Compose previews.
 *
 * This extension provides SYMPHONY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SYMPHONY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SYMPHONY: Any
  get() = object {
      /** DeviceSpec(manufacturer=SYMPHONY, code=i68, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYMPHONY, code=i68, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I68 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SYMPHONY, code=i74, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYMPHONY, code=i74, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val I74 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SYMPHONY, code=R40, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYMPHONY, code=R40, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val R40 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SYMPHONY, code=V128, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SYMPHONY, code=V128, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val V128 = "spec:width=480,height=960,unit=px,dpi=240"

  }
