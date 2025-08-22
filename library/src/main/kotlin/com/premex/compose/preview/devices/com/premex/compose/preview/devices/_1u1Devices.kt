package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 1u1 device specifications for Android Compose previews.
 *
 * This extension provides 1u1 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._1u1.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._1u1: Any
  get() = object {
      /** DeviceSpec(manufacturer=1u1, code=diw362_1u1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=1u1, code=diw362_1u1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW362_1U1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=1u1, code=DIW377-1u1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=1u1, code=DIW377-1u1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW377_1U1 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=1u1, code=diw387_1u1, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=1u1, code=diw387_1u1, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW387_1U1 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
