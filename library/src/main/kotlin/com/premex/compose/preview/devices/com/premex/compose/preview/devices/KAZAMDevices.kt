package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KAZAM device specifications for Android Compose previews.
 *
 * This extension provides KAZAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KAZAM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KAZAM: Any
  get() = object {
      /** DeviceSpec(manufacturer=KAZAM, code=KAZAM, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAZAM, code=KAZAM, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val KAZAM = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=KAZAM, code=Tornado_348, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAZAM, code=Tornado_348, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TORNADO_348 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KAZAM, code=TR6L5035, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAZAM, code=TR6L5035, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TR6L5035 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
