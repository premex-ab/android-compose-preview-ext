package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CongoTelecom device specifications for Android Compose previews.
 *
 * This extension provides CongoTelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.CongoTelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.CongoTelecom: Any
  get() = object {
      /** DeviceSpec(manufacturer=CongoTelecom, code=Speed, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=CongoTelecom, code=Speed,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val SPEED = "spec:width=720,height=1600,unit=px,dpi=280"

  }
