package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MotorolaSolutions device specifications for Android Compose previews.
 *
 * This extension provides MotorolaSolutions device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MotorolaSolutions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MotorolaSolutions: Any
  get() = object {
      /** DeviceSpec(manufacturer=MotorolaSolutions, code=LEXF10, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MotorolaSolutions, code=LEXF10,
      width=480, height=800, dpi=240, isGoogleDevice=false).code */
      val LEXF10 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=MotorolaSolutions, code=lexl10ig, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MotorolaSolutions, code=lexl10ig,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val LEXL10IG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MotorolaSolutions, code=lexl11g_64, width=720, height=1280,
      dpi=320, isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MotorolaSolutions,
      code=lexl11g_64, width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val LEXL11G_64 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
