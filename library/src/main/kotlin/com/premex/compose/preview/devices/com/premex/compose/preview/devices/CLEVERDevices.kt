package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CLEVER device specifications for Android Compose previews.
 *
 * This extension provides CLEVER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CLEVER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CLEVER: Any
  get() = object {
      /** DeviceSpec(manufacturer=CLEVER, code=T45, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CLEVER, code=T45, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val T45 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
