package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RWC device specifications for Android Compose previews.
 *
 * This extension provides RWC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RWC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RWC: Any
  get() = object {
      /** DeviceSpec(manufacturer=RWC, code=HNPD01, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RWC, code=HNPD01, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val HNPD01 = "spec:width=1536,height=2048,unit=px,dpi=320"

  }
