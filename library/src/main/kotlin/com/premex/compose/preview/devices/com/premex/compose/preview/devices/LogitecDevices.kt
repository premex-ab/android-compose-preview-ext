package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Logitec device specifications for Android Compose previews.
 *
 * This extension provides Logitec device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Logitec.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Logitec: Any
  get() = object {
      /** DeviceSpec(manufacturer=Logitec, code=LZ-AA10, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Logitec, code=LZ-AA10, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val LZ_AA10 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
