package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * G_Anica device specifications for Android Compose previews.
 *
 * This extension provides G_Anica device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GAnica.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GAnica: Any
  get() = object {
      /** DeviceSpec(manufacturer=G_Anica, code=HL_1088_A133P, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=G_Anica, code=HL_1088_A133P,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val HL_1088_A133P = "spec:width=800,height=1280,unit=px,dpi=160"

  }
