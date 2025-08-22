package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Truevisions device specifications for Android Compose previews.
 *
 * This extension provides Truevisions device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Truevisions.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Truevisions: Any
  get() = object {
      /** DeviceSpec(manufacturer=Truevisions, code=HP42F, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Truevisions, code=HP42F,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val HP42F = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Truevisions, code=TrueHCH03, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Truevisions, code=TrueHCH03,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val TRUEHCH03 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Truevisions, code=TrueHPH07, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Truevisions, code=TrueHPH07,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val TRUEHPH07 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
