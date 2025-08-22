package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DigiDragon device specifications for Android Compose previews.
 *
 * This extension provides DigiDragon device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DigiDragon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DigiDragon: Any
  get() = object {
      /** DeviceSpec(manufacturer=DigiDragon, code=DS502, width=480, height=960, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DigiDragon, code=DS502, width=480,
      height=960, dpi=220, isGoogleDevice=false).code */
      val DS502 = "spec:width=480,height=960,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=DigiDragon, code=DS571, width=540, height=1140, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DigiDragon, code=DS571, width=540,
      height=1140, dpi=240, isGoogleDevice=false).code */
      val DS571 = "spec:width=540,height=1140,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DigiDragon, code=DS6018, width=600, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DigiDragon, code=DS6018, width=600,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val DS6018 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DigiDragon, code=DS6261, width=480, height=1014, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DigiDragon, code=DS6261, width=480,
      height=1014, dpi=220, isGoogleDevice=false).code */
      val DS6261 = "spec:width=480,height=1014,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=DigiDragon, code=708Z, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DigiDragon, code=708Z, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val _708Z = "spec:width=600,height=1024,unit=px,dpi=160"

  }
