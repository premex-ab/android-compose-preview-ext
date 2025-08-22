package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Go3 device specifications for Android Compose previews.
 *
 * This extension provides Go3 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Go3.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Go3: Any
  get() = object {
      /** DeviceSpec(manufacturer=Go3, code=HP44H, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Go3, code=HP44H, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HP44H = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
