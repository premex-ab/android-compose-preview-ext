package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ASPERA device specifications for Android Compose previews.
 *
 * This extension provides ASPERA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ASPERA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ASPERA: Any
  get() = object {
      /** DeviceSpec(manufacturer=ASPERA, code=ASPERA_R10, width=720, height=1600, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASPERA, code=ASPERA_R10, width=720,
      height=1600, dpi=240, isGoogleDevice=false).code */
      val ASPERA_R10 = "spec:width=720,height=1600,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ASPERA, code=R9, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ASPERA, code=R9, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val R9 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
