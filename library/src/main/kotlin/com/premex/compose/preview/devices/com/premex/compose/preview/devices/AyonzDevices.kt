package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Ayonz device specifications for Android Compose previews.
 *
 * This extension provides Ayonz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ayonz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ayonz: Any
  get() = object {
      /** DeviceSpec(manufacturer=Ayonz, code=hanyang, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Ayonz, code=hanyang, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
