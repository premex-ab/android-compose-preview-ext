package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZULEISY device specifications for Android Compose previews.
 *
 * This extension provides ZULEISY device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZULEISY.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZULEISY: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZULEISY, code=E8A, width=800, height=1340, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZULEISY, code=E8A, width=800,
      height=1340, dpi=213, isGoogleDevice=false).code */
      val E8A = "spec:width=800,height=1340,unit=px,dpi=213"

  }
