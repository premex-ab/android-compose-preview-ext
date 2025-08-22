package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TAMBO device specifications for Android Compose previews.
 *
 * This extension provides TAMBO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TAMBO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TAMBO: Any
  get() = object {
      /** DeviceSpec(manufacturer=TAMBO, code=TA-55_Power, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=TAMBO, code=TA-55_Power, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TA_55_POWER = "spec:width=720,height=1280,unit=px,dpi=320"

  }
