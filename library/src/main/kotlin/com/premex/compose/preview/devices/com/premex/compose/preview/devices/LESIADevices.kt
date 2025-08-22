package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LESIA device specifications for Android Compose previews.
 *
 * This extension provides LESIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LESIA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LESIA: Any
  get() = object {
      /** DeviceSpec(manufacturer=LESIA, code=C5, width=480, height=960, dpi=198,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LESIA, code=C5, width=480,
      height=960, dpi=198, isGoogleDevice=false).code */
      val C5 = "spec:width=480,height=960,unit=px,dpi=198"

      /** DeviceSpec(manufacturer=LESIA, code=HOT_30, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LESIA, code=HOT_30, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val HOT_30 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LESIA, code=K2s, width=480, height=960, dpi=198,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LESIA, code=K2s, width=480,
      height=960, dpi=198, isGoogleDevice=false).code */
      val K2S = "spec:width=480,height=960,unit=px,dpi=198"

      /** DeviceSpec(manufacturer=LESIA, code=K6, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LESIA, code=K6, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val K6 = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=LESIA, code=NEO_9, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LESIA, code=NEO_9, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val NEO_9 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LESIA, code=SMART_7, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LESIA, code=SMART_7, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SMART_7 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
