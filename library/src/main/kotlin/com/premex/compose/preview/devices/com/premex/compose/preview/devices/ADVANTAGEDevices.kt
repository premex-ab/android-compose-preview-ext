package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADVANTAGE device specifications for Android Compose previews.
 *
 * This extension provides ADVANTAGE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADVANTAGE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADVANTAGE: Any
  get() = object {
      /** DeviceSpec(manufacturer=ADVANTAGE, code=I101MTK, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ADVANTAGE, code=I101MTK, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val I101MTK = "spec:width=800,height=1280,unit=px,dpi=160"

  }
