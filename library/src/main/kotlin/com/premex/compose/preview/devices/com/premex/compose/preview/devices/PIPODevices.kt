package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PIPO device specifications for Android Compose previews.
 *
 * This extension provides PIPO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PIPO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PIPO: Any
  get() = object {
      /** DeviceSpec(manufacturer=PIPO, code=IconX_P109, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PIPO, code=IconX_P109, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ICONX_P109 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
