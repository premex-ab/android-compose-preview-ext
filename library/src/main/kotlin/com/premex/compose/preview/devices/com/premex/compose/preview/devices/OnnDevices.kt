package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Onn device specifications for Android Compose previews.
 *
 * This extension provides Onn device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onn.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onn: Any
  get() = object {
      /** DeviceSpec(manufacturer=Onn, code=stephen, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Onn, code=stephen, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val STEPHEN = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Onn, code=sti6140d360, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Onn, code=sti6140d360, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val STI6140D360 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
