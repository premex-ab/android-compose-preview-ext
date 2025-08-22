package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MarQ device specifications for Android Compose previews.
 *
 * This extension provides MarQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MarQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MarQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=MarQ, code=bangbae, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MarQ, code=bangbae, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val BANGBAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MarQ, code=GIONEE_MAX, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MarQ, code=GIONEE_MAX, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val GIONEE_MAX = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MarQ, code=komagome, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MarQ, code=komagome, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val KOMAGOME = "spec:width=720,height=1280,unit=px,dpi=213"

  }
