package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Rakuten device specifications for Android Compose previews.
 *
 * This extension provides Rakuten device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rakuten.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rakuten: Any
  get() = object {
      /** DeviceSpec(manufacturer=Rakuten, code=C330, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rakuten, code=C330, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val C330 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Rakuten, code=gaea, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rakuten, code=gaea, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val GAEA = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=Rakuten, code=P710, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rakuten, code=P710, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P710 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Rakuten, code=P780, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Rakuten, code=P780, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val P780 = "spec:width=720,height=1520,unit=px,dpi=320"

  }
