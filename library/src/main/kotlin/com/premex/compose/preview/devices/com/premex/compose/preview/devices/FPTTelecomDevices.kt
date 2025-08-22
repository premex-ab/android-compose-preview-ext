package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FPT_Telecom device specifications for Android Compose previews.
 *
 * This extension provides FPT_Telecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FPTTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FPTTelecom: Any
  get() = object {
      /** DeviceSpec(manufacturer=FPT_Telecom, code=DV8536-KVF, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FPT_Telecom, code=DV8536-KVF,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8536_KVF = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FPT_Telecom, code=SEI500FPT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FPT_Telecom, code=SEI500FPT,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI500FPT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FPT_Telecom, code=SEI610FPT, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FPT_Telecom, code=SEI610FPT,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI610FPT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
