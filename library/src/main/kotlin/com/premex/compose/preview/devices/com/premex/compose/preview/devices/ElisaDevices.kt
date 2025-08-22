package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Elisa device specifications for Android Compose previews.
 *
 * This extension provides Elisa device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Elisa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Elisa: Any
  get() = object {
      /** DeviceSpec(manufacturer=Elisa, code=STB_ELISA_B866V2F01, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Elisa, code=STB_ELISA_B866V2F01,
      width=720, height=1280, dpi=320, isGoogleDevice=false).code */
      val STB_ELISA_B866V2F01 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
