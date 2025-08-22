package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Nexta device specifications for Android Compose previews.
 *
 * This extension provides Nexta device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nexta.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nexta: Any
  get() = object {
      /** DeviceSpec(manufacturer=Nexta, code=Smart_Study_1, width=1200, height=2000, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Nexta, code=Smart_Study_1,
      width=1200, height=2000, dpi=280, isGoogleDevice=false).code */
      val SMART_STUDY_1 = "spec:width=1200,height=2000,unit=px,dpi=280"

  }
