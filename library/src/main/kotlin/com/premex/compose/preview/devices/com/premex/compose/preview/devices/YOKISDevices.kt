package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * YOKIS device specifications for Android Compose previews.
 *
 * This extension provides YOKIS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.YOKIS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.YOKIS: Any
  get() = object {
      /** DeviceSpec(manufacturer=YOKIS, code=Tablet, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=YOKIS, code=Tablet, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val TABLET = "spec:width=800,height=1280,unit=px,dpi=160"

  }
