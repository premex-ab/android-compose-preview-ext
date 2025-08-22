package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KAICOM device specifications for Android Compose previews.
 *
 * This extension provides KAICOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KAICOM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KAICOM: Any
  get() = object {
      /** DeviceSpec(manufacturer=KAICOM, code=K901, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAICOM, code=K901, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K901 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KAICOM, code=K901_2, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAICOM, code=K901_2, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val K901_2 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=KAICOM, code=W660, width=640, height=1136, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KAICOM, code=W660, width=640,
      height=1136, dpi=320, isGoogleDevice=false).code */
      val W660 = "spec:width=640,height=1136,unit=px,dpi=320"

  }
