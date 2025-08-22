package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BYYBUO device specifications for Android Compose previews.
 *
 * This extension provides BYYBUO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BYYBUO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BYYBUO: Any
  get() = object {
      /** BYYBUO BYYBUO_SmartPad_A10 */
      val BYYBUO_SMARTPAD_A10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** BYYBUO BYYBUO_SmartPad_T10 */
      val BYYBUO_SMARTPAD_T10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** BYYBUO SmartPad_T10_EU */
      val SMARTPAD_T10_EU = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
