package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Meswao device specifications for Android Compose previews.
 *
 * This extension provides Meswao device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Meswao.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Meswao: Any
  get() = object {
      /** DeviceSpec(manufacturer=Meswao, code=MES-B3, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Meswao, code=MES-B3, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val MES_B3 = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
