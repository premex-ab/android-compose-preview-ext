package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MGS device specifications for Android Compose previews.
 *
 * This extension provides MGS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MGS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MGS: Any
  get() = object {
      /** DeviceSpec(manufacturer=MGS, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MGS, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MGS, code=bruno, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MGS, code=bruno, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BRUNO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=MGS, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MGS, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

  }
