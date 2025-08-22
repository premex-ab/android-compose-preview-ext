package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOA device specifications for Android Compose previews.
 *
 * This extension provides NOA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOA: Any
  get() = object {
      /** DeviceSpec(manufacturer=NOA, code=Fresh_4G, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=Fresh_4G, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val FRESH_4G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOA, code=Hummer_2019_R, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=Hummer_2019_R, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val HUMMER_2019_R = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOA, code=N1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=N1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val N1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOA, code=NOA_N10, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=NOA_N10, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val NOA_N10 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NOA, code=NOA_N20, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=NOA_N20, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val NOA_N20 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=NOA, code=NOA_N7, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=NOA_N7, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NOA_N7 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOA, code=NOA_N8, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=NOA_N8, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NOA_N8 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOA, code=NOA_P1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=NOA_P1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val NOA_P1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOA, code=SPRINT4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=SPRINT4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SPRINT4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOA, code=Vivo4G_r, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOA, code=Vivo4G_r, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val VIVO4G_R = "spec:width=640,height=1280,unit=px,dpi=320"

  }
