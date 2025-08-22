package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALBADEEL device specifications for Android Compose previews.
 *
 * This extension provides ALBADEEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALBADEEL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALBADEEL: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALBADEEL, code=ikebukuro, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALBADEEL, code=ikebukuro,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val IKEBUKURO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=ALBADEEL, code=samseong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALBADEEL, code=samseong,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val SAMSEONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
