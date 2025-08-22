package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * gpelectronic device specifications for Android Compose previews.
 *
 * This extension provides gpelectronic device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Gpelectronic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Gpelectronic: Any
  get() = object {
      /** DeviceSpec(manufacturer=gpelectronic, code=YC-3135D, width=480, height=800, dpi=120,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=gpelectronic, code=YC-3135D,
      width=480, height=800, dpi=120, isGoogleDevice=false).code */
      val YC_3135D = "spec:width=480,height=800,unit=px,dpi=120"

  }
