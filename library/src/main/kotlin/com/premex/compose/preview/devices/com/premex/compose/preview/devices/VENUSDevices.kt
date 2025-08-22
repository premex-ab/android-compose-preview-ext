package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VENUS device specifications for Android Compose previews.
 *
 * This extension provides VENUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VENUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VENUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=VENUS, code=V5_Plus_, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=VENUS, code=V5_Plus_, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val V5_PLUS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
