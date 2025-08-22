package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ECHO device specifications for Android Compose previews.
 *
 * This extension provides ECHO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ECHO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ECHO: Any
  get() = object {
      /** DeviceSpec(manufacturer=ECHO, code=ECHO_FUSION, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=ECHO_FUSION, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ECHO_FUSION = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ECHO, code=ECHO_LOLLY, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=ECHO_LOLLY, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val ECHO_LOLLY = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=ECHO, code=FEELING, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=FEELING, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val FEELING = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ECHO, code=HOLI, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=HOLI, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val HOLI = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ECHO, code=HORIZON_LITE_PLUS, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=HORIZON_LITE_PLUS,
      width=720, height=1440, dpi=320, isGoogleDevice=false).code */
      val HORIZON_LITE_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ECHO, code=HORIZON_M, width=640, height=1280, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=HORIZON_M, width=640,
      height=1280, dpi=280, isGoogleDevice=false).code */
      val HORIZON_M = "spec:width=640,height=1280,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=ECHO, code=LOOK, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=LOOK, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LOOK = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ECHO, code=Stellar_4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=Stellar_4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STELLAR_4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=ECHO, code=SURF, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ECHO, code=SURF, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val SURF = "spec:width=480,height=960,unit=px,dpi=240"

  }
