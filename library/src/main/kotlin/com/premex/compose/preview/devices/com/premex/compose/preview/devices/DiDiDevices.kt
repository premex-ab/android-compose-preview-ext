package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DiDi device specifications for Android Compose previews.
 *
 * This extension provides DiDi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DiDi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DiDi: Any
  get() = object {
      /** DeviceSpec(manufacturer=DiDi, code=DDT-001, width=720, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DiDi, code=DDT-001, width=720,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val DDT_001 = "spec:width=720,height=1280,unit=px,dpi=240"

  }
