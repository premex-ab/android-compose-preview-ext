package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * sooka device specifications for Android Compose previews.
 *
 * This extension provides sooka device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sooka.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sooka: Any
  get() = object {
      /** DeviceSpec(manufacturer=sooka, code=sooka-TV_v1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=sooka, code=sooka-TV_v1,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SOOKA_TV_V1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
