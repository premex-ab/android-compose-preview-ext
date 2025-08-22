package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TanoshiScholar device specifications for Android Compose previews.
 *
 * This extension provides TanoshiScholar device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TanoshiScholar.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TanoshiScholar: Any
  get() = object {
      /** DeviceSpec(manufacturer=TanoshiScholar, code=TTBKB10-A1, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TanoshiScholar, code=TTBKB10-A1,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val TTBKB10_A1 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
