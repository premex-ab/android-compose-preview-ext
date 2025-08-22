package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SonyAudio device specifications for Android Compose previews.
 *
 * This extension provides SonyAudio device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SonyAudio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SonyAudio: Any
  get() = object {
      /** DeviceSpec(manufacturer=SonyAudio, code=icx1293, width=720, height=1280, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SonyAudio, code=icx1293, width=720,
      height=1280, dpi=360, isGoogleDevice=false).code */
      val ICX1293 = "spec:width=720,height=1280,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=SonyAudio, code=icx1295, width=720, height=1280, dpi=360,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SonyAudio, code=icx1295, width=720,
      height=1280, dpi=360, isGoogleDevice=false).code */
      val ICX1295 = "spec:width=720,height=1280,unit=px,dpi=360"

      /** DeviceSpec(manufacturer=SonyAudio, code=icx1298, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SonyAudio, code=icx1298, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ICX1298 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SonyAudio, code=icx1301, width=720, height=1280, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SonyAudio, code=icx1301, width=720,
      height=1280, dpi=400, isGoogleDevice=false).code */
      val ICX1301 = "spec:width=720,height=1280,unit=px,dpi=400"

      /** DeviceSpec(manufacturer=SonyAudio, code=icx1302, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SonyAudio, code=icx1302, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val ICX1302 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
