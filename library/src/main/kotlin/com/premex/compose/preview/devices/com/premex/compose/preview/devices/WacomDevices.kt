package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wacom device specifications for Android Compose previews.
 *
 * This extension provides Wacom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wacom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wacom: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wacom, code=CintiqCompanionHybrid13HD, width=1080, height=1920,
      dpi=160, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wacom,
      code=CintiqCompanionHybrid13HD, width=1080, height=1920, dpi=160, isGoogleDevice=false).code
      */
      val CINTIQCOMPANIONHYBRID13HD = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
