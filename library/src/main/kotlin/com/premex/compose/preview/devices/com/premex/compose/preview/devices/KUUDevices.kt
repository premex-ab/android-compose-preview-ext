package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KUU device specifications for Android Compose previews.
 *
 * This extension provides KUU device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KUU.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KUU: Any
  get() = object {
      /** DeviceSpec(manufacturer=KUU, code=UPAD2021, width=1600, height=2176, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=KUU, code=UPAD2021, width=1600,
      height=2176, dpi=320, isGoogleDevice=false).code */
      val UPAD2021 = "spec:width=1600,height=2176,unit=px,dpi=320"

  }
