package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Takara device specifications for Android Compose previews.
 *
 * This extension provides Takara device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Takara.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Takara: Any
  get() = object {
      /** DeviceSpec(manufacturer=Takara, code=MID169, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Takara, code=MID169, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MID169 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
