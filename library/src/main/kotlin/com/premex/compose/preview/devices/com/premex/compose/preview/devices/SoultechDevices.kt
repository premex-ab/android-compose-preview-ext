package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Soultech device specifications for Android Compose previews.
 *
 * This extension provides Soultech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Soultech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Soultech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Soultech, code=TB001, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Soultech, code=TB001, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val TB001 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
