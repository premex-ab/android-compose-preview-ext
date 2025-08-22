package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AKINO device specifications for Android Compose previews.
 *
 * This extension provides AKINO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AKINO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AKINO: Any
  get() = object {
      /** DeviceSpec(manufacturer=AKINO, code=hamamatsucho, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AKINO, code=hamamatsucho,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val HAMAMATSUCHO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AKINO, code=laoshan, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AKINO, code=laoshan, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val LAOSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
