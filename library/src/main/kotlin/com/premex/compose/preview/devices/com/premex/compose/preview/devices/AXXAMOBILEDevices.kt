package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AXXA_MOBILE device specifications for Android Compose previews.
 *
 * This extension provides AXXA_MOBILE device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AXXAMOBILE.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AXXAMOBILE: Any
  get() = object {
      /** DeviceSpec(manufacturer=AXXA_MOBILE, code=GEM, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AXXA_MOBILE, code=GEM, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GEM = "spec:width=720,height=1280,unit=px,dpi=320"

  }
