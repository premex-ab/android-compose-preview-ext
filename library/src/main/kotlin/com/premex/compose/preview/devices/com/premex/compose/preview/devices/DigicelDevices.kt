package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Digicel device specifications for Android Compose previews.
 *
 * This extension provides Digicel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Digicel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Digicel: Any
  get() = object {
      /** DeviceSpec(manufacturer=Digicel, code=DL3PlusPro, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digicel, code=DL3PlusPro,
      width=720, height=1520, dpi=320, isGoogleDevice=false).code */
      val DL3PLUSPRO = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Digicel, code=DL4s_TC, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digicel, code=DL4s_TC, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val DL4S_TC = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=Digicel, code=DL4_2022, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digicel, code=DL4_2022, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val DL4_2022 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Digicel, code=DL4_Plus, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digicel, code=DL4_Plus, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val DL4_PLUS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=Digicel, code=DL5_Pro, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Digicel, code=DL5_Pro, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val DL5_PRO = "spec:width=480,height=960,unit=px,dpi=213"

  }
