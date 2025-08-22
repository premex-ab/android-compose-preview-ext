package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kempler_Strauss device specifications for Android Compose previews.
 *
 * This extension provides Kempler_Strauss device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KemplerStrauss.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KemplerStrauss: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kempler_Strauss, code=Alumini_3_Plus, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kempler_Strauss,
      code=Alumini_3_Plus, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val ALUMINI_3_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
