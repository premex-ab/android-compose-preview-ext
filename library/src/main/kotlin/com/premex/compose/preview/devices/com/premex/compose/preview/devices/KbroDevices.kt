package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * kbro device specifications for Android Compose previews.
 *
 * This extension provides kbro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kbro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kbro: Any
  get() = object {
      /** DeviceSpec(manufacturer=kbro, code=sti6160d19, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=kbro, code=sti6160d19, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6160D19 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
