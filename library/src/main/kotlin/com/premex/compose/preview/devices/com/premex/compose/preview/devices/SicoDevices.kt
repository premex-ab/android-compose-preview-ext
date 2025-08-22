package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * sico device specifications for Android Compose previews.
 *
 * This extension provides sico device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sico.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sico: Any
  get() = object {
      /** DeviceSpec(manufacturer=sico, code=Plus2_4G, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=sico, code=Plus2_4G, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val PLUS2_4G = "spec:width=480,height=854,unit=px,dpi=240"

  }
