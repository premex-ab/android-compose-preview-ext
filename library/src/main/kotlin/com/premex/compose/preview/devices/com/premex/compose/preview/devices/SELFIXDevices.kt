package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SELFIX device specifications for Android Compose previews.
 *
 * This extension provides SELFIX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SELFIX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SELFIX: Any
  get() = object {
      /** DeviceSpec(manufacturer=SELFIX, code=ES733, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SELFIX, code=ES733, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val ES733 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=SELFIX, code=X5, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SELFIX, code=X5, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val X5 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=SELFIX, code=X7, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SELFIX, code=X7, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val X7 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
