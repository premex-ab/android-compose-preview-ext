package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hitachi device specifications for Android Compose previews.
 *
 * This extension provides Hitachi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hitachi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hitachi: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hitachi, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hitachi, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Hitachi, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hitachi, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hitachi, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hitachi, code=samseong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
