package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GLOBALSEC device specifications for Android Compose previews.
 *
 * This extension provides GLOBALSEC device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.GLOBALSEC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.GLOBALSEC: Any
  get() = object {
      /** DeviceSpec(manufacturer=GLOBALSEC, code=TAB_TEN, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=GLOBALSEC, code=TAB_TEN,
      width=1200, height=1920, dpi=280, isGoogleDevice=false).code */
      val TAB_TEN = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
