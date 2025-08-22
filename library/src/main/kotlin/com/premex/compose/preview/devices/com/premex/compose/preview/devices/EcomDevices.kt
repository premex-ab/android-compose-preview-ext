package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ecom device specifications for Android Compose previews.
 *
 * This extension provides ecom device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ecom: Any
  get() = object {
      /** DeviceSpec(manufacturer=ecom, code=Ex-Handy10, width=320, height=432, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ecom, code=Ex-Handy10, width=320,
      height=432, dpi=160, isGoogleDevice=false).code */
      val EX_HANDY10 = "spec:width=320,height=432,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=ecom, code=Smart-Ex02, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ecom, code=Smart-Ex02, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SMART_EX02 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
