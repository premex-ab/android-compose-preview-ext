package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dijitsu device specifications for Android Compose previews.
 *
 * This extension provides Dijitsu device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dijitsu.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dijitsu: Any
  get() = object {
      /** DeviceSpec(manufacturer=Dijitsu, code=DCT_90, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Dijitsu, code=DCT_90, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val DCT_90 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
