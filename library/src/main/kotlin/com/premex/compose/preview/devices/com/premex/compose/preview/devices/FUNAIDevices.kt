package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FUNAI device specifications for Android Compose previews.
 *
 * This extension provides FUNAI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FUNAI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FUNAI: Any
  get() = object {
      /** DeviceSpec(manufacturer=FUNAI, code=daitou, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUNAI, code=daitou, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DAITOU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FUNAI, code=FAS_K2150, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FUNAI, code=FAS_K2150, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val FAS_K2150 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
