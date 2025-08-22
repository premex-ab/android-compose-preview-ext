package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NOWO device specifications for Android Compose previews.
 *
 * This extension provides NOWO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NOWO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NOWO: Any
  get() = object {
      /** DeviceSpec(manufacturer=NOWO, code=DV8535-KPN, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOWO, code=DV8535-KPN, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8535_KPN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NOWO, code=DV8935-KPN, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NOWO, code=DV8935-KPN, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8935_KPN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
