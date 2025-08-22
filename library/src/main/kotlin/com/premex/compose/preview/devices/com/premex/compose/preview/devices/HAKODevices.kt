package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HAKO device specifications for Android Compose previews.
 *
 * This extension provides HAKO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HAKO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HAKO: Any
  get() = object {
      /** DeviceSpec(manufacturer=HAKO, code=GMP, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAKO, code=GMP, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val GMP = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=HAKO, code=YXU, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HAKO, code=YXU, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val YXU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
