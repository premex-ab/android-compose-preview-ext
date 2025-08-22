package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MINT device specifications for Android Compose previews.
 *
 * This extension provides MINT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MINT.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MINT: Any
  get() = object {
      /** DeviceSpec(manufacturer=MINT, code=M5CR, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINT, code=M5CR, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val M5CR = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MINT, code=Mint_Fox, width=320, height=480, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINT, code=Mint_Fox, width=320,
      height=480, dpi=160, isGoogleDevice=false).code */
      val MINT_FOX = "spec:width=320,height=480,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=MINT, code=Mint_Fusion, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINT, code=Mint_Fusion, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MINT_FUSION = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MINT, code=Pearl_Neo, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MINT, code=Pearl_Neo, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PEARL_NEO = "spec:width=480,height=854,unit=px,dpi=240"

  }
