package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PLUM device specifications for Android Compose previews.
 *
 * This extension provides PLUM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PLUM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PLUM: Any
  get() = object {
      /** DeviceSpec(manufacturer=PLUM, code=Z555, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLUM, code=Z555, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z555 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PLUM, code=Z570, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLUM, code=Z570, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z570 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PLUM, code=Z711, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLUM, code=Z711, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Z711 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=PLUM, code=Z712, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PLUM, code=Z712, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val Z712 = "spec:width=600,height=1024,unit=px,dpi=213"

  }
