package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Eudora device specifications for Android Compose previews.
 *
 * This extension provides Eudora device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eudora.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eudora: Any
  get() = object {
      /** DeviceSpec(manufacturer=Eudora, code=E10Pro, width=800, height=1280, dpi=190,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Eudora, code=E10Pro, width=800,
      height=1280, dpi=190, isGoogleDevice=false).code */
      val E10PRO = "spec:width=800,height=1280,unit=px,dpi=190"

      /** DeviceSpec(manufacturer=Eudora, code=E62Plus, width=480, height=1014, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Eudora, code=E62Plus, width=480,
      height=1014, dpi=213, isGoogleDevice=false).code */
      val E62PLUS = "spec:width=480,height=1014,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Eudora, code=E65Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Eudora, code=E65Pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val E65PRO = "spec:width=720,height=1600,unit=px,dpi=280"

  }
