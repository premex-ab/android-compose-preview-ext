package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CASIO device specifications for Android Compose previews.
 *
 * This extension provides CASIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CASIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CASIO: Any
  get() = object {
      /** DeviceSpec(manufacturer=CASIO, code=dtx400, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CASIO, code=dtx400, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val DTX400 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=CASIO, code=dtx450, width=480, height=800, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CASIO, code=dtx450, width=480,
      height=800, dpi=220, isGoogleDevice=false).code */
      val DTX450 = "spec:width=480,height=800,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=CASIO, code=itg400, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CASIO, code=itg400, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ITG400 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CASIO, code=itg600, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CASIO, code=itg600, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ITG600 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=CASIO, code=itg650, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CASIO, code=itg650, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val ITG650 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
